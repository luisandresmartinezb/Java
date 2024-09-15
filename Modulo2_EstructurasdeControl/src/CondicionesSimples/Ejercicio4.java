package CondicionesSimples;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) 
	{
	
		 // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números enteros
        System.out.print("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Determinar si num1 es múltiplo de num2
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else if (num2 % num1 == 0) {
            System.out.println(num2 + " es múltiplo de " + num1);
        } else {
            System.out.println("Ninguno de los números es múltiplo del otro.");
        }

        // Cerrar el scanner
        scanner.close();
		
		
		
	}

}
