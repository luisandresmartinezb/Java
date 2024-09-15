package AgendaTelefonica;

import java.util.Scanner;

public class AgendaTelefonica {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcion;

        do {
            System.out.println("\nMenú de Agenda Telefónica:");
            System.out.println("1. Registrar contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Mostrar espacios disponibles");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Registrar contacto
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el número del contacto: ");
                    String numero = scanner.nextLine();
                    Contacto nuevoContacto = new Contacto(nombre, numero);
                    agenda.registrarContacto(nuevoContacto);
                    break;

                case 2:
                    // Listar contactos
                    agenda.listarContactos();
                    break;

                case 3:
                    // Buscar contacto
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    agenda.buscarContacto(nombreBuscar);
                    break;

                case 4:
                    // Mostrar espacios disponibles
                    agenda.disponibles();
                    break;

                case 5:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
		
	}

}
