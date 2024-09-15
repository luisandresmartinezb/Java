package Matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Pedir al usuario las dimensiones de las matrices
        System.out.println("Ingrese el número de filas (N): ");
        int n = scanner.nextInt();

        System.out.println("Ingrese el número de columnas (M): ");
        int m = scanner.nextInt();

        // Declarar las matrices
        int[][] matriz1 = new int[n][m];  // Números pares aleatorios entre 0 y 100
        int[][] matriz2 = new int[n][m];  // Números impares aleatorios entre 0 y 50
        int[][] matriz3 = new int[n][m];  // Suma de la matriz1 y matriz2

        // Llenar la primera matriz con números pares aleatorios entre 0 y 100
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int numeroPar;
                do {
                    numeroPar = random.nextInt(101);  // Genera número aleatorio entre 0 y 100
                } while (numeroPar % 2 != 0);  // Repite hasta que sea par
                matriz1[i][j] = numeroPar;
            }
        }

        // Llenar la segunda matriz con números impares aleatorios entre 0 y 50
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int numeroImpar;
                do {
                    numeroImpar = random.nextInt(51);  // Genera número aleatorio entre 0 y 50
                } while (numeroImpar % 2 == 0);  // Repite hasta que sea impar
                matriz2[i][j] = numeroImpar;
            }
        }

        // Llenar la tercera matriz con la suma de los valores de la primera y segunda matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Mostrar las tres matrices
        System.out.println("Matriz 1 (Pares entre 0 y 100): ");
        imprimirMatriz(matriz1);

        System.out.println("\nMatriz 2 (Impares entre 0 y 50): ");
        imprimirMatriz(matriz2);

        System.out.println("\nMatriz 3 (Suma de Matriz 1 y Matriz 2): ");
        imprimirMatriz(matriz3);
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

	}

}
