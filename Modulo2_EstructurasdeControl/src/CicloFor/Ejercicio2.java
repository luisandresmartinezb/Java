package CicloFor;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        
     // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        
     // Llamar al método para encontrar y mostrar los divisores
        encontrarDivisores(numero);
        
        // Cerrar el escáner
        scanner.close();
         
        
	}

	// Método para encontrar y mostrar los divisores de un número
    public static void encontrarDivisores(int numero)
    {
        System.out.println("Los divisores de " + numero + " son:");
        
        // Iterar desde 1 hasta el número dado para encontrar sus divisores
        for (int i = 1; i <= numero; i++) 
        {
            if (numero % i == 0) 
            {
                System.out.println(i);  // Mostrar el divisor
            }
        }
		
	

	}

}
