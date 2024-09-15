package CondicionesSimples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) 
	{
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario que ingrese la nota del estudiante
            System.out.print("Ingresa la nota del estudiante (0 a 10): ");
            double nota = scanner.nextDouble();

            // Verificar si la nota está dentro del rango válido
            if (nota >= 0 && nota <= 10) {
                // Determinar si el estudiante aprobó o no
                if (nota >= 7) {
                    System.out.println("El estudiante aprobó la clase.");
                } else {
                    System.out.println("El estudiante perdió la clase.");
                }
            } else {
                System.out.println("Nota inválida. La nota debe estar entre 0 y 10.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número decimal válido (usa el punto como separador decimal).");
        } finally {
            // Cerrar el scanner
            scanner.close();
        }

	}

}
