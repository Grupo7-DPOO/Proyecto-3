/*
package Principal;
import java.util.Scanner;
import Clases.Habitaciones;
import Clases.Plato;
import Clases.Usuario;
import Clases.Factura;
import Clases.Cliente;
import Clases.Reserva;
import Clases.Restaurante;
public class Principal {
 public static void main(String[] args) {
	Habitaciones habitaciones = null;
    Usuario usuario = null;
    Scanner sc = new Scanner(System.in);
	int opcion = 0;
	Cliente cliente = null;
	Factura factura = null;
	Reserva reserva = null;
	Restaurante restaurante = new Restaurante(opcion);
	
	do {
		System.out.println("Menú principal");
		System.out.println("1. Crear cliente");
		System.out.println("2. Consultar cliente");
		System.out.println("3. Crear factura");
		System.out.println("4. Consultar factura");
		System.out.println("5. Crear reserva");
		System.out.println("6. Cancelar reserva");
		System.out.println("7. Consultar reserva");
		System.out.println("8. Crear habitación");
		System.out.println("9. Consultar habitación");
		System.out.println("10. Editar habitación");
		System.out.println("11. Consultar tarifa");
		System.out.println("12. Crear usuario");
		System.out.println("13. Deshabilitar usuario");
		System.out.println("14. Crear Plato");
		System.out.println("15. Crear Menu");
		System.out.println("16. Consultar Platos");
		System.out.println("17. Consultar Menu");
		System.out.println("0. Salir");
		System.out.print("Ingrese una opción: ");
		opcion = sc.nextInt();
		sc.nextLine(); 

		Object habitacion;
		switch (opcion) {
			case 1:
				System.out.print("Ingrese el nombre del cliente: ");
				String nombre = sc.nextLine();
				System.out.print("Ingrese la fecha de nacimiento del cliente (dd/mm/aaaa): ");
				String nacimiento = sc.nextLine();
				System.out.print("Ingrese el ID del cliente: ");
				int id = sc.nextInt();
				sc.nextLine(); 
				System.out.print("Ingrese el correo electrónico del cliente: ");
				String correo = sc.nextLine();

				cliente = new Cliente(nombre, nacimiento, id, correo);
				cliente.crearCliente();
				break;
			case 2:
				if (cliente == null) {
					System.out.println("No se ha creado ningún cliente aún.");
					break;
				}
				System.out.print("Ingrese el ID del cliente a consultar: ");
				int idCliente = sc.nextInt();
				sc.nextLine(); 
				String resultado = cliente.consultarCliente(idCliente);
				System.out.println(resultado);
				break;
			case 3:
				System.out.print("Ingrese la fecha de la factura (dd/mm/aaaa): ");
				String fecha = sc.nextLine();
				System.out.print("Ingrese el ID de la factura: ");
				int id2 = sc.nextInt();
				sc.nextLine(); 
				System.out.print("Ingrese el nombre del cliente: ");
				String cliente2 = sc.nextLine();
				System.out.print("Ingrese el nombre del recepcionista: ");
				String recepcionista = sc.nextLine();

				factura = new Factura(fecha, id2, cliente2, recepcionista);
				factura.crearFactura();
				break;
			case 4:
				if (factura == null) {
					System.out.println("No se ha creado ninguna factura aún.");
					break;
				}
				System.out.print("Ingrese el ID de la factura a consultar: ");
				int idFactura = sc.nextInt();
				sc.nextLine(); 
				String resultado2 = factura.consultarFactura(idFactura);
				System.out.println(resultado2);
				break;
			case 5:
				System.out.print("Ingrese la cantidad de personas: ");
				int cantidadDePersonas = sc.nextInt();
				sc.nextLine(); 
				System.out.print("Ingrese la fecha de llegada (dd/mm/aaaa): ");
				String fechaDeLlegada = sc.nextLine();
				System.out.print("Ingrese la hora de llegada (hh:mm): ");
				String horaDeLlegada = sc.nextLine();
				System.out.print("Ingrese la hora de salida (hh:mm): ");
				String horaDeSalida = sc.nextLine();
				System.out.print("¿Desea una cama para menores? (S/N): ");
				boolean camaParaMenores = sc.nextLine().equalsIgnoreCase("S");
				System.out.print("Ingrese la cantidad de menores: ");
				int cantidadDeMenores = sc.nextInt();
				sc.nextLine(); 
				System.out.print("Ingrese el ID de la reserva: ");
				int id3 = sc.nextInt();
				sc.nextLine(); 

				reserva = new Reserva(cantidadDePersonas, fechaDeLlegada, horaDeLlegada,
									  horaDeSalida, camaParaMenores, cantidadDeMenores, id3);
				reserva.crearReserva();
				break;
			case 6:
				if (reserva == null) {
					System.out.println("No se ha creado ninguna reserva aún.");
					break;
				}
				System.out.print("Ingrese el ID de la reserva a cancelar: ");
				int idReserva = sc.nextInt();
				sc.nextLine(); 
				reserva.cancelarReserva(idReserva);
				break;
			case 7:
				if (reserva == null) {
					System.out.println("No se ha creado ninguna reserva aún.");
					break;
				}
				System.out.print("Ingrese el ID de la reserva a consultar: ");
				int idReservaConsulta = sc.nextInt();
				sc.nextLine(); 
				String resultado3 = reserva.consultarReserva(idReservaConsulta);
				System.out.println(resultado3);
				break;
			case 8:
				System.out.println("Ingrese el número de habitación: ");
				int numero = sc.nextInt();
				System.out.println("Ingrese la tarifa de la habitación: ");
				int tarifa = sc.nextInt();
				System.out.println("Ingrese la ubicación de la habitación: ");
				String ubicacion = sc.next();
				System.out.println("¿La habitación tiene balcón?: ");
				boolean balcon = sc.nextBoolean();
				System.out.println("Ingrese el tipo de habitación: ");
				String tipo = sc.next();
				System.out.println("¿La habitación tiene vista?: ");
				boolean vista = sc.nextBoolean();
				System.out.println("¿La habitación tiene cocina?: ");
				boolean cocina = sc.nextBoolean();

				habitaciones = new Habitaciones(numero, tarifa, ubicacion, balcon, tipo, vista, cocina);
				boolean creado = habitaciones.crearHabitacion(numero, tarifa, ubicacion, balcon, tipo, vista, cocina);
				
				System.out.println((creado)?"Habitación Creada":"Error: Habitación ya existe");
			case 9:
				System.out.println("Ingrese el número de habitación que desea consultar: ");
				int numero1 = sc.nextInt();
				habitaciones.consultarHabitacion(numero1);
			case 10:
				System.out.println("Ingrese el número de habitación que desea editar: ");
				int numero11 = sc.nextInt();
				System.out.println("Ingrese la tarifa de la habitación: ");
				int tarifa1 = sc.nextInt();
				System.out.println("Ingrese la ubicación de la habitación: ");
				String ubicacion1 = sc.next();
				System.out.println("¿La habitación tiene balcón?: ");
				boolean balcon1 = sc.nextBoolean();
				System.out.println("Ingrese el tipo de habitación: ");
				String tipo1 = sc.next();
				System.out.println("¿La habitación tiene vista?: ");
				boolean vista1 = sc.nextBoolean();
				System.out.println("¿La habitación tiene cocina?: ");
				boolean cocina1 = sc.nextBoolean();
				habitaciones.editarHabitacion(numero11, tarifa1, ubicacion1, balcon1, tipo1, vista1, cocina1);
			case 11:
				System.out.println("Ingrese el número de habitación del que desea conocer la tarifa: ");
				int numero111 = sc.nextInt();
				habitaciones.consultarTarifa(numero111);
			case 12:
				System.out.println("Ingrese se nombre de usuario: ");
				String login = sc.next();
				System.out.println("Ingrese su contraseña: ");
				String password = sc.next();

				usuario = new Usuario (password, login);
				boolean creado1 = usuario.crearUsuario(password, login);
				System.out.println((creado1)?"Usuario creado":"Error: Usuario ya existe");
			case 13:
				System.out.println("Ingrese el usuario de la persona que desea deshabilitar: ");
				String login1 = sc.next();
				usuario.deshabilitarUsuario(login1);
			case 14:
				System.out.println("Digite id");
				int id1 = sc.nextInt();
				System.out.println("Digite nombre");
				String nombre2 = sc.next();
				System.out.println("Digite ingredientes");
				String ingredientes = sc.next();
				System.out.println("Digite numero ingredientes");
				int cantidad_ingredientes = sc.nextInt();
				boolean hecho = restaurante.crearPlato(id1, nombre2, ingredientes, cantidad_ingredientes);
				System.out.println((hecho)?"plato Creado":"Error: plato ya existe");
				break;
			case 15:
				System.out.println("Digite nombre");
				String nombre_de_plato = sc.next();
				System.out.println("Disponibilidad: True or False");
				boolean disponibilidad = sc.nextBoolean();
				System.out.println("Digite bebida");
				String bebida = sc.next();
				System.out.println("Digite precio");
				int precios = sc.nextInt();
				System.out.println("Digite el ID del plato que desea agregar al menú: ");
				int id11 = sc.nextInt();
				Plato plato = restaurante.getPlato(id11);
				boolean hecho1 = restaurante.crearMenu(nombre_de_plato, disponibilidad, bebida, precios, plato);
				System.out.println("El plato se ha agregado al menú exitosamente.");
				System.out.println((hecho1)?"plato Creado":"Error: plato ya existe");
				break;
			case 16:
				System.out.println(restaurante.consultarPlatos());
			case 17:
				System.out.println(restaurante.consultaMenu());
				break;
			case 0:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción inválida, por favor intente de nuevo.");
			}
		} while (opcion != 17);
		sc.close();
	}	

}
*/
