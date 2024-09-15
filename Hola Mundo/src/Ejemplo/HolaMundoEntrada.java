package Ejemplo;

import java.util.Scanner;

public class HolaMundoEntrada {

	public static void main(String[] args) 
	{
		 // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un mensaje
        System.out.print("Ingresa un mensaje: ");
        String mensaje = scanner.nextLine();

        // Imprimir el mensaje ingresado por el usuario
        System.out.println(mensaje);

        // Cerrar el scanner
        scanner.close();

	}

}
