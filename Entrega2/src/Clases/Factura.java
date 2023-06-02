package Clases; 
import java.io.*;

public class Factura {
    private String fecha;       // Fecha en la que se hizo la factura
    private int id;             // Número de identificación único de la factura
    private String cliente;     // Nombre del cliente
    private String recepcionista;   // Nombre de la persona que atendió al cliente
    
    /**
     * Constructor de la clase Factura.
     * @param fecha: Fecha en la que se hizo la factura.
     * @param id: Número de identificación único de la factura.
     * @param cliente: Nombre del cliente.
     * @param recepcionista: Nombre de la persona que atendió al cliente.
     */
    public Factura(String fecha, int id, String cliente, String recepcionista) {
        this.fecha = fecha;
        this.id = id;
        this.cliente = cliente;
        this.recepcionista = recepcionista;
    }
    
    /**
     * Crea el archivo "facturas.csv" y escribe la información de la factura en una nueva línea.
     * Si el archivo ya existe, se agrega la información de la factura en una nueva línea.
     */
    public void crearFactura() {
        try {
            FileWriter fw = new FileWriter("facturas.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(fecha + "," + id + "," + cliente + "," + recepcionista);
            pw.flush();
            pw.close();

            System.out.println("Factura creada exitosamente en el archivo facturas.csv.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo facturas.csv: " + e.getMessage());
        }
    }
    
    /**
     * Busca el ID de la factura en el archivo "facturas.csv" y devuelve la información de la factura. 
     * @param idFactura: el ID de la Factura a buscar en el archivo.
     * @return la información de la factura si se encuentra en el archivo, o un mensaje de error si ocurre algún problema.
     */
    public String consultarFactura(int idFactura) {
        String resultado = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("facturas.csv"));
            String linea = br.readLine();
            while (linea != null) {
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[1]);
                if (id == idFactura) {
                    resultado = "Fecha: " + datos[0] + "\nID: " + datos[1] + "\nCliente: " + datos[2] + "\nRecepcionista: " + datos[3];
                    break;
                }
                linea = br.readLine();
            }
            br.close();
            if (resultado.isEmpty()) {
                resultado = "No se encontró ninguna factura con el ID " + idFactura;
            }
        } catch (IOException e) {
            resultado = "Error al leer el archivo facturas.csv: " + e.getMessage();
        } catch (NumberFormatException e) {
            resultado = "Error al convertir el ID a un número entero: " + e.getMessage();
        }
        return resultado;
    }
}




