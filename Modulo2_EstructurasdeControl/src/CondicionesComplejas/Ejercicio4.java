package CondicionesComplejas;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) 
	{
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad total de preguntas y las preguntas correctas
        System.out.print("Ingrese la cantidad total de preguntas: ");
        int totalPreguntas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de preguntas contestadas correctamente: ");
        int preguntasCorrectas = scanner.nextInt();

        // Verificar que el número de preguntas correctas no sea mayor que el total de preguntas
        if (preguntasCorrectas > totalPreguntas) {
            System.out.println("Error: La cantidad de preguntas contestadas correctamente no puede ser mayor que el total de preguntas.");
            return;
        }

        // Calcular el porcentaje de respuestas correctas
        double porcentajeCorrectas = (double) preguntasCorrectas / totalPreguntas * 100;

        // Determinar el nivel basado en el porcentaje
        String nivel;
        if (porcentajeCorrectas >= 90) {
            nivel = "Nivel máximo";
        } else if (porcentajeCorrectas >= 75) {
            nivel = "Nivel medio";
        } else if (porcentajeCorrectas >= 50) {
            nivel = "Nivel regular";
        } else {
            nivel = "Fuera de nivel";
        }

        // Mostrar el resultado
        System.out.printf("El porcentaje de respuestas correctas es: %.2f%%\n", porcentajeCorrectas);
        System.out.println("Nivel: " + nivel);

        // Cerrar el scanner
        scanner.close();

	}

}
