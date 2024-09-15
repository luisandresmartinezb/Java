package CondicionesSimples;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) 
	{
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        // Determinar si el número es negativo
        if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");
        } else {
            System.out.println("El número " + numero + " no es negativo.");
        }

        // Cerrar el scanner
        scanner.close();

	}

}
