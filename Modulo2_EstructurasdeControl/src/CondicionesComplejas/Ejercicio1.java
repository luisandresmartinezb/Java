package CondicionesComplejas;

import java.util.Scanner;

public class Ejercicio1 
{

	public static void main(String[] args) 
	{
		// Crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su edad
        System.out.print("Por favor, ingrese su edad: ");
        int edad = scanner.nextInt();

        // Determinar la categoría de acuerdo con la edad
        String categoria;

        if (edad >= 0 && edad <= 5) {
            categoria = "Infante";
        } else if (edad >= 6 && edad <= 10) {
            categoria = "Niño";
        } else if (edad >= 11 && edad <= 15) {
            categoria = "Pre adolescente";
        } else if (edad >= 16 && edad <= 18) {
            categoria = "Adolescente";
        } else if (edad >= 19 && edad <= 25) {
            categoria = "Pre adulto";
        } else if (edad >= 26 && edad <= 40) {
            categoria = "Adulto";
        } else if (edad >= 41 && edad <= 55) {
            categoria = "Pre anciano";
        } else if (edad >= 56) {
            categoria = "Anciano";
        } else {
            categoria = "Edad inválida";
        }

        // Imprimir la categoría correspondiente
        System.out.println("La categoría correspondiente a su edad es: " + categoria);

        // Cerrar el escáner
        scanner.close();
		
	}

}
