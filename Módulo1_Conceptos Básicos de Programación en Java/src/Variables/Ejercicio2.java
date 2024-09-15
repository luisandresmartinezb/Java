package Variables;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		//Declaraciones de las variables
		Double a = 8.0;               
		int b = 'A';                  
		String c = "Colombia";        
		char d = 'A';                 
		float e = 74548f;             
		int numero1 = 10;                  
		String nombre_persona ="Luis Andrés";        
		double edad = 0.0;            
		double altura = 1.75;         
		int alturareal = (int) altura;
		int num_double = 96;          
		a = 98.0;                     
		int x = a.intValue();         
		int y = 25;                   
		String g = Integer.toString(y);
		
		
		//Mostramos por pantalla los valores de las variables
		System.out.println("Valor de a: " + a);
		System.out.println("Valor de b (ASCII de 'A'): " + b);
		System.out.println("Valor de c: " + c);
		System.out.println("Valor de d: " + d);
		System.out.println("Valor de e: " + e);
		System.out.println("Valor de numero1: " + numero1);
		System.out.println("Valor de nombre_persona: " + nombre_persona);
		System.out.println("Valor de edad: " + edad);
		System.out.println("Valor de altura: " + altura);
		System.out.println("Valor de alturareal: " + alturareal);
		System.out.println("Valor de num_double: " + num_double);
		System.out.println("Nuevo valor de a: " + a);
		System.out.println("Valor de x: " + x);
		System.out.println("Valor de y: " + y);
		System.out.println("Valor de g: " + g);
		
		
	}

}
