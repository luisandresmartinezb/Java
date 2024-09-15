package CondicionesSimples;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		// Generar un número aleatorio entre 1 y 100
        int numeroAleatorio = (int) (Math.random() * 100) + 1;

        // Mostrar el número generado
        System.out.println("El número aleatorio generado es: " + numeroAleatorio);

        // Verificar si el número es menor o mayor a 50
        if (numeroAleatorio < 50) {
            System.out.println("El número es menor que 50.");
        } else if (numeroAleatorio > 50) {
            System.out.println("El número es mayor que 50.");
        } else {
            System.out.println("El número es igual a 50.");
        }

	}

}
