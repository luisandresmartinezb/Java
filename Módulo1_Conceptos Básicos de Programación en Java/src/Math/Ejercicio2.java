package Math;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		
		// Declaración de los números
        int[] numeros = {2, 8, 9, 27, 28, 55, 121};
		
	     // Calcular y mostrar la raíz cuadrada de cada número
	        for (int numero : numeros)
	        {
	            double raizCuadrada = Math.sqrt(numero);
	            System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
	        }
		
	}

}
