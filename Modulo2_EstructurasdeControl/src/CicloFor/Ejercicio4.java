package CicloFor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) 
	{
	 
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
     // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
     // Calcular la sumatoria de todas las iteraciones desde 0 hasta el número
        int sumatoria = calcularSumatoria(numero);
        System.out.println("Sumatoria desde 0 hasta " + numero + ": " + sumatoria);

        // Calcular la raíz cuadrada de la sumatoria
        double raizCuadrada = Math.sqrt(sumatoria);
        System.out.println("Raíz cuadrada de la sumatoria: " + raizCuadrada);

        // Generar un número aleatorio entre 1 y la sumatoria
        int numeroAleatorio = generarNumeroAleatorio(1, sumatoria);
        System.out.println("Número aleatorio entre 1 y " + sumatoria + ": " + numeroAleatorio);

        // Determinar los divisores de la sumatoria
        List<Integer> divisores = obtenerDivisores(sumatoria);
        System.out.println("Divisores de la sumatoria: " + divisores);

        // Calcular el factorial de la sumatoria
        long factorial = calcularFactorial(sumatoria);
        System.out.println("Factorial de la sumatoria: " + factorial);

        // Verificar si la sumatoria es un número perfecto
        if (esNumeroPerfecto(sumatoria)) {
            System.out.println(sumatoria + " es un número perfecto.");
        } else {
            System.out.println(sumatoria + " no es un número perfecto.");
        }

        scanner.close();
	}
        
        // Método para calcular la sumatoria desde 0 hasta el número dado
        public static int calcularSumatoria(int numero) {
            int sumatoria = 0;
            for (int i = 0; i <= numero; i++) {
                sumatoria += i;
            }
            return sumatoria;
        }

        // Método para generar un número aleatorio entre un rango dado
        public static int generarNumeroAleatorio(int min, int max) {
            Random random = new Random();
            return random.nextInt((max - min) + 1) + min;
        }

        // Método para obtener los divisores de un número
        public static List<Integer> obtenerDivisores(int numero) {
            List<Integer> divisores = new ArrayList<>();
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    divisores.add(i);
                }
            }
            return divisores;
        }

        // Método para calcular el factorial de un número
        public static long calcularFactorial(int numero) {
            if (numero == 0 || numero == 1) {
                return 1;
            }
            long factorial = 1;
            for (int i = 2; i <= numero; i++) {
                factorial *= i;
            }
            return factorial;
        }

        // Método para verificar si un número es perfecto
        public static boolean esNumeroPerfecto(int numero) {
            int sumaDivisores = 0;
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    sumaDivisores += i;
                }
            }
            return sumaDivisores == numero;	

	}

}
