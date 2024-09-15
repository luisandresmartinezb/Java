package CondicionesComplejas;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) 
	{
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese tres números enteros
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        // Determinar el mayor de los tres números
        int mayor;

        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        // Mostrar el resultado
        System.out.println("El número mayor es: " + mayor);

        // Cerrar el scanner
        scanner.close();

	}

}
