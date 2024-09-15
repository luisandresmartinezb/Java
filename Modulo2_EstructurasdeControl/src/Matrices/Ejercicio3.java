package Matrices;

import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) 
	{
		// Crear la matriz 3x4
        int filas = 3;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        // Rellenar la matriz con números aleatorios entre 0 y 9
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(10); // Números aleatorios del 0 al 9
            }
        }

        // Imprimir la matriz completa
        System.out.println("Matriz generada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Imprimir la primera fila
        System.out.println("\nPrimera fila:");
        for (int j = 0; j < columnas; j++) {
            System.out.print(matriz[0][j] + " ");
        }
        System.out.println();

        // Imprimir la segunda columna
        System.out.println("\nSegunda columna:");
        for (int i = 0; i < filas; i++) {
            System.out.println(matriz[i][1]);
        }

        // Imprimir la tercera fila
        System.out.println("\nTercera fila:");
        for (int j = 0; j < columnas; j++) {
            System.out.print(matriz[2][j] + " ");
        }
        System.out.println();

	}

}
