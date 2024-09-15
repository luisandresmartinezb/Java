package Matrices;

import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		// Dimensiones de la matriz
        final int Filas = 5;
        final int Columnas = 3;

        // Crear la matriz
        int[][] matriz = new int[Filas][Columnas];
        Random random = new Random();

        // Rellenar la matriz con números aleatorios entre 0 y 50
        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {
                matriz[i][j] = random.nextInt(51); // Número aleatorio entre 0 y 50
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Encontrar el número mayor
        int mayor = matriz[0][0];
        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }

        // Imprimir el número mayor
        System.out.println("El número mayor en la matriz es: " + mayor);
		

	}

}
