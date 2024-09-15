package CicloWhile;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la palabra al usuario
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();
        
        // Convertir la palabra a minúsculas para evitar errores por diferencias de mayúsculas
        palabra = palabra.toLowerCase();
        
        // Eliminar espacios y signos de puntuación si es necesario
        palabra = palabra.replaceAll("[^a-zA-Z]", "");
        
        // Verificar si la palabra es un palíndromo
        if (esPalindromo(palabra)) {
            System.out.println("La palabra \"" + palabra + "\" es un palíndromo.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no es un palíndromo.");
        }
        
        scanner.close();
    }
    
    public static boolean esPalindromo(String palabra) {
        // Invertir la palabra
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
        
        // Comparar la palabra original con su versión invertida
        return palabra.equals(palabraInvertida);
	}

}


