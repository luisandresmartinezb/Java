package SwitchCase;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		 // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el tipo de motor
        System.out.print("Ingrese el tipo de motor (0, 1, 2, 3): ");
        int tipoMotor = scanner.nextInt();

        // Usar el switch para determinar el fluido según el tipo de motor
        switch (tipoMotor) {
            case 0:
                System.out.println("No hay establecido un valor definido para el tipo.");
                break;
            case 1:
                System.out.println("Agua");
                break;
            case 2:
                System.out.println("Gasolina");
                break;
            case 3:
                System.out.println("Hormigón");
                break;
            default:
                System.out.println("No existe un valor válido.");
                break;
        }

        // Cerrar el scanner
        scanner.close();

	}

}
