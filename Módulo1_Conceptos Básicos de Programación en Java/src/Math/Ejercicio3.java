package Math;

public class Ejercicio3 {

	public static void main(String[] args) 
	{
		// Generar 5 números aleatorios entre 0 y 10
        int nota1 = (int)(Math.random() * 11);
        int nota2 = (int)(Math.random() * 11);
        int nota3 = (int)(Math.random() * 11);
        int nota4 = (int)(Math.random() * 11);
        int nota5 = (int)(Math.random() * 11);

        // Mostrar las notas generadas
        System.out.println("Notas generadas:");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("Nota 5: " + nota5);

        // Calcular el promedio de las 5 notas
        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5.0;

        // Mostrar el resultado del promedio
        System.out.println("El promedio de las 5 notas es: " + promedio);

	}

}
