package Vectores;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		// Declaramos un vector para almacenar los pesos de 5 personas
        float[] pesos = new float[5];
        Scanner sc = new Scanner(System.in);

        // Pedimos los pesos de las personas y los almacenamos en el vector
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el peso de la persona " + (i + 1) + ": ");
            
            // Leemos el input como un String
            String pesoInput = sc.next();
            
            // Reemplazamos las comas por puntos
            pesoInput = pesoInput.replace(",", ".");
            
            // Convertimos el String a float
            pesos[i] = Float.parseFloat(pesoInput);
        }

        // Calculamos el promedio del peso
        float suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += pesos[i];
        }
        float promedio = suma / 5;

        // Contamos cuántas personas están por encima y por debajo del promedio
        int superioresAlPromedio = 0;
        int inferioresAlPromedio = 0;

        for (int i = 0; i < 5; i++) {
            if (pesos[i] > promedio) {
                superioresAlPromedio++;
            } else if (pesos[i] < promedio) {
                inferioresAlPromedio++;
            }
        }

        // Mostramos los resultados
        System.out.println("El promedio del peso es: " + promedio);
        System.out.println("Cantidad de personas que superan el promedio del peso: " + superioresAlPromedio);
        System.out.println("Cantidad de personas que están por debajo del promedio del peso: " + inferioresAlPromedio);
        
        sc.close();


	}

}
