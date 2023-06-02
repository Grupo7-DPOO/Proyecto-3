package Clases;
import java.io.*;

public class Reserva {
	  private int cantidad_de_personas;   // Cantidad de personas que incluye la reserva
	  private String fecha_de_llegada;    // Fecha en la que llegan los huéspedes
	  private String hora_de_llegada;     // Hora en la que llegan los huéspedes
	  private String hora_de_salida;      // Hora en la que salen los huéspedes
	  private boolean cama_para_menores;  // Se incluye cama para menores o no
	  private int cantidad_de_menores;    // Cantidad de menores de edad incluidos en la reserva
	  private int ID;                     // Número único de identificación de la reserva
	 
	  /**
	     * Constructor de la clase Reserva
	     * @param cantidad_de_personas: Cantidad de personas que incluye la reserva
	     * @param fecha_de_llegada: Fecha en la que llegan los huéspedes
	     * @param hora_de_llegada: Hora en la que llegan los huéspedes
	     * @param hora_de_salida: Hora en la que salen los huéspedes
	     * @param cama_para_menores: Se incluye cama para menores o no
	     * @param cantidad_de_menores: Cantidad de menores de edad incluidos en la reserva
	     * @param ID: Número único de identificación de la reserva
	     */
    public Reserva(int cantidad_de_personas, String fecha_de_llegada, String hora_de_llegada,
                   String hora_de_salida, boolean cama_para_menores, int cantidad_de_menores, int ID) {
        this.cantidad_de_personas = cantidad_de_personas;
        this.fecha_de_llegada = fecha_de_llegada;
        this.hora_de_llegada = hora_de_llegada;
        this.hora_de_salida = hora_de_salida;
        this.cama_para_menores = cama_para_menores;
        this.cantidad_de_menores = cantidad_de_menores;
        this.ID = ID;
    }
    
    /**
     * Crea el archivo "reservas.csv" y escribe la información de la reserva en una nueva línea.
     * Si el archivo ya existe, se agrega la información de la reserva en una nueva línea.
     */
    public void crearReserva() {
        try {
            FileWriter fw = new FileWriter("reservas.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(cantidad_de_personas + "," + fecha_de_llegada + "," + hora_de_llegada + "," +
                       hora_de_salida + "," + cama_para_menores + "," + cantidad_de_menores + "," + ID);
            pw.flush();
            pw.close();

            System.out.println("Reserva creada exitosamente en el archivo reservas.csv.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo reservas.csv: " + e.getMessage());
        }
    }
    /**
     * Cancela una reserva previamente creada a partir de su ID. Elimina la información de la reserva del archivo de reservas.
     * @param idReserva: El ID de la reserva a cancelar
     * @return true si la reserva fue cancelada exitosamente, false si no se encontró la reserva o hubo un problema al leer/eliminar el archivo
     */
    public boolean cancelarReserva(int idReserva) {
        try {
            // Crear un archivo temporal para almacenar las reservas que no se van a cancelar
            File archivoTemp = new File("temp.csv");
            FileWriter fw = new FileWriter(archivoTemp, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            // Leer el archivo de reservas y copiar todas las reservas que no tengan el ID a cancelar al archivo temporal
            BufferedReader br = new BufferedReader(new FileReader("reservas.csv"));
            String linea = br.readLine();
            boolean encontrado = false;
            while (linea != null) {
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[6]);
                if (id == idReserva) {
                    encontrado = true;
                } else {
                    pw.println(linea);
                }
                linea = br.readLine();
            }
            br.close();
            pw.flush();
            pw.close();

            // Si no se encontró ninguna reserva con el ID a cancelar, retornar false
            if (!encontrado) {
                return false;
            }

            // Eliminar el archivo original de reservas y renombrar el archivo temporal con el nombre original
            File archivoOriginal = new File("reservas.csv");
            archivoOriginal.delete();
            archivoTemp.renameTo(archivoOriginal);

            return true;
        } catch (IOException e) {
            System.out.println("Error al leer/eliminar el archivo de reservas: " + e.getMessage());
            return false;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir el ID a un número entero: " + e.getMessage());
            return false;
        }
    } 
    /**
     * Busca el ID de la reserva en el archivo "reservas.csv" y devuelve la información de la reserva. 
     * @param idReserva: el ID de la Reserva a buscar en el archivo.
     * @return la información de la reserva si se encuentra en el archivo, o un mensaje de error si ocurre algún problema.
     */
    public String consultarReserva(int idReserva) {
        String resultado = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("reservas.csv"));
            String linea = br.readLine();
            while (linea != null) {
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[6]);
                if (id == idReserva) {
                    resultado = "Cantidad de personas: " + datos[0] + "\nFecha de llegada: " + datos[1] + "\nHora de llegada: " + datos[2] + "\nHora de salida: " + datos[3] + "\nCama para menores: " + datos[4] + "\nCantidad de menores: " + datos[5] + "\nID: " + datos[6];
                    break;
                }
                linea = br.readLine();
            }
            br.close();
            if (resultado.isEmpty()) {
                resultado = "No se encontró ninguna reserva con el ID " + idReserva;
            }
        } catch (IOException e) {
            resultado = "Error al leer el archivo reservas.csv: " + e.getMessage();
        } catch (NumberFormatException e) {
            resultado = "Error al convertir el ID a un número entero: " + e.getMessage();
        }
        return resultado;
    }
}