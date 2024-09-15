package CicloFor;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) 
	{
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        
     // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        
        
     // Verificar si el número es perfecto
        if (esNumeroPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }

        scanner.close();

	}
	
	// Método que verifica si un número es perfecto
    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;

        // Encontrar los divisores propios del número
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        // Comprobar si la suma de los divisores es igual al número
        return sumaDivisores == numero;
		
		
	}

}
