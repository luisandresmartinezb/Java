package CicloFor;

public class Ejercicio1 {
	
	// Definimos el número para el cual queremos calcular el factorial
	private static final int FACTORIAL_NUMBER = 6;

	
	public static void main(String[] args) 
	{
	     // Calculamos el factorial del número definido
	      long factorial = calculateFactorial(FACTORIAL_NUMBER);

	      // Mostramos el resultado
	      System.out.println("El factorial de " + FACTORIAL_NUMBER + " es " + factorial);
	    }

		/**
	    * Método para calcular el factorial de un número entero.
	    * @param n El número entero del que queremos calcular el factorial.
	    * @return El factorial del número.
	    */
		
	    private static long calculateFactorial(int n) {
	        // Inicializamos el resultado como 1 (0! = 1 y también sirve para multiplicaciones)
	        long result = 1;

	        // Calculamos el factorial usando un bucle
	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }

	        return result;
	}

}
