package Operaciones;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		// Crear una variable para almacenar el nombre de un estudiante
        String nombreEstudiante = "Luis Andres";
		
        
     // Crear 5 variables de tipo double para almacenar 5 diferentes notas decimales
        double nota1 = 8.5;
        double nota2 = 4.5;
        double nota3 = 9.6;
        double nota4 = 8.3;
        double nota5 = 6.7;
        
        
     // Calcular el promedio final del estudiante a partir de las 5 notas decimales 
        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        
        
     // Mostrar el resultado y el nombre del estudiante
        System.out.println("Nombre del estudiante: " + nombreEstudiante);
        System.out.println("Promedio final: " + promedio); 
		
		
	}

}
