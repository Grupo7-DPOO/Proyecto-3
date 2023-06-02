package Clases; 
import java.io.*;

public class Cliente {
    private String nombre; // Nombre del cleinte.
    private String nacimiento; // Nacimiento del cliente 
    private int id; // Numero de identificacion unico del cliente. 
    private String correo; // Correo electronico del cliente.

    /**
     * Constructor de la clase Cliente.
     *
     * @param nombre: El nombre del cliente.
     * @param nacimiento: La fecha de nacimiento del cliente.
     * @param id: El número de identificación único del cliente.
     * @param correo: El correo electrónico del cliente.
     */
    public Cliente(String nombre, String nacimiento, int id, String correo) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.id = id;
        this.correo = correo;
    }

    /**
     * Crea el archivo "clientes.csv" y escribe la información del cliente en una nueva línea.
     * Si el archivo ya existe, se agrega la información del cliente en una nueva línea.
     */
    public void crearCliente() {
        try {
            FileWriter fw = new FileWriter("clientes.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(nombre + "," + nacimiento + "," + id + "," + correo);
            pw.flush();
            pw.close();

            System.out.println("Cliente creado exitosamente en el archivo clientes.csv.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo clientes.csv: " + e.getMessage());
        }
    }

    /**
     * Busca el ID del cliente en el archivo "clientes.csv" y devuelve la información del cliente.
     * @param idCliente: el ID del cliente a buscar en el archivo.
     * @return la información del cliente si se encuentra en el archivo, o un mensaje de error si ocurre algún problema.
     */
    public String consultarCliente(int idCliente) {
        String resultado = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("clientes.csv"));
            String linea = br.readLine();
            while (linea != null) {
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[2]);
                if (id == idCliente) {
                    resultado = "Nombre: " + datos[0] + "\nFecha de nacimiento: " + datos[1] + "\nID: " + datos[2] + "\nCorreo: " + datos[3];
                    break;
                }
                linea = br.readLine();
            }
            br.close();
            if (resultado.isEmpty()) {
                resultado = "No se encontró ningún cliente con el ID " + idCliente;
            }
        } catch (IOException e) {
            resultado = "Error al leer el archivo clientes.csv: " + e.getMessage();
        } catch (NumberFormatException e) {
            resultado = "Error al convertir el ID a un número entero: " + e.getMessage();
        }
        return resultado;
    }
}