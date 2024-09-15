package Vectores;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        // Declaramos los arreglos para almacenar las notas de los estudiantes de los dos grupos
        float[] grupoA = new float[10];
        float[] grupoB = new float[10];

        // Pedimos las notas del Grupo A
        System.out.println("Ingrese las notas finales de los estudiantes del Grupo A :");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nota del estudiante " + (i + 1) + ": ");
            
            // Leemos el input como un String
            String notaInput = sc.next();
            
            // Reemplazamos las comas por puntos
            notaInput = notaInput.replace(",", ".");
            
            // Convertimos el String a float
            grupoA[i] = Float.parseFloat(notaInput);
        }

        // Pedimos las notas del Grupo B
        System.out.println("Ingrese las notas finales de los estudiantes del Grupo B :");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nota del estudiante " + (i + 1) + ": ");
            
            // Leemos el input como un String
            String notaInput = sc.next();
            
            // Reemplazamos las comas por puntos
            notaInput = notaInput.replace(",", ".");
            
            // Convertimos el String a float
            grupoB[i] = Float.parseFloat(notaInput);
        }

        // Calcular el promedio del Grupo A
        float sumaA = 0;
        for (int i = 0; i < 10; i++) {
            sumaA += grupoA[i];
        }
        float promedioA = sumaA / 10;

        // Calcular el promedio del Grupo B
        float sumaB = 0;
        for (int i = 0; i < 10; i++) {
            sumaB += grupoB[i];
        }
        float promedioB = sumaB / 10;

        // Calcular el promedio general de ambos grupos
        float promedioGeneral = (sumaA + sumaB) / 20;

        // Determinar cuál grupo tiene mejor promedio
        String mejorGrupo;
        if (promedioA > promedioB) {
            mejorGrupo = "Grupo A";
        } else if (promedioB > promedioA) {
            mejorGrupo = "Grupo B";
        } else {
            mejorGrupo = "Ambos grupos tienen el mismo promedio.";
        }

        // Mostrar los resultados
        System.out.println("\nPromedio del Grupo A: " + promedioA);
        System.out.println("Promedio del Grupo B: " + promedioB);
        System.out.println("Promedio general de ambos grupos: " + promedioGeneral);
        System.out.println("El grupo con mejor promedio es: " + mejorGrupo);

        sc.close();

	}

}
