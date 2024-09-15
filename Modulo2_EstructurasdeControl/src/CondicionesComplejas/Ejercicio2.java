package CondicionesComplejas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		 // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número (de hasta 4 cifras): ");
        int numero = scanner.nextInt();

        // Obtener el número absoluto para manejar números negativos
        int numeroAbs = Math.abs(numero);

        // Verificar la cantidad de cifras
        if (numeroAbs >= 1000) {
            if (numeroAbs <= 9999) {
                // Número tiene 4 cifras
                System.out.println("El número tiene 4 cifras.");
            } else {
                // Número tiene más de 4 cifras
                System.out.println("Error: El número supera las 4 cifras.");
            }
        } else if (numeroAbs >= 100) {
            // Número tiene 3 cifras
            System.out.println("El número tiene 3 cifras.");
        } else if (numeroAbs >= 10) {
            // Número tiene 2 cifras
            System.out.println("El número tiene 2 cifras.");
        } else {
            // Número tiene 1 cifra
            System.out.println("El número tiene 1 cifra.");
        }
        
        // Cerrar el scanner
        scanner.close();
		
	}

}
