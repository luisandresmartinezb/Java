package Operaciones;

public class Ejercicio3 {

	public static void main(String[] args) 
	{
		// Crear una variable entera de nombre “numeroUno” con el valor de 8
		int numeroUno = 8;
				
		// Crear una variable entera de nombre “numeroDos” con el valor de 2
		int numeroDos = 2;
		        
		        
		//Mostrar los valores originales
		 System.out.println("Valores originales:");
		 System.out.println("numeroUno: " + numeroUno);
		 System.out.println("numeroDos: " + numeroDos);
		        
		// Intercambiar los valores utilizando una variable auxiliar
		 int auxiliar = numeroUno;
		numeroUno = numeroDos;
		numeroDos = auxiliar;

	   // Mostrar los resultados después del intercambio
		System.out.println("Valores después del intercambio:");
		System.out.println("numeroUno: " + numeroUno);
		System.out.println("numeroDos: " + numeroDos);
		
	}

}
