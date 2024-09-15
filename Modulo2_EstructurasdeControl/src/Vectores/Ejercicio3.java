package Vectores;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) 
	{
		// Crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese una palabra
        System.out.println("Ingrese una palabra:");
        String palabra = scanner.nextLine();
        
        // Obtener la longitud de la palabra
        int longitudPalabra = palabra.length();
        
        // Crear un array de caracteres del tamaño de la palabra
        char[] caracteres = new char[longitudPalabra];
        
        // Recorrer la palabra y almacenar cada carácter en el array
        for (int i = 0; i < longitudPalabra; i++) {
            caracteres[i] = palabra.charAt(i);
        }
        
        // Mostrar el número de caracteres de la palabra
        System.out.println("La palabra '" + palabra + "' tiene " + longitudPalabra + " caracteres.");
        
        // Mostrar el contenido del array
        System.out.println("El contenido del vector de caracteres es:");
        for (char c : caracteres) {
            System.out.print(c + " ");
        }

	}

}
