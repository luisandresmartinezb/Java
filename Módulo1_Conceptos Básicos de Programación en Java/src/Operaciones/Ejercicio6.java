package Operaciones;

public class Ejercicio6 {

	public static void main(String[] args) 
	{
		// Crear una variable entera llamada “ladoCuadrado” de valor 8.
        int ladoCuadrado = 8;
        
        // Calcular el área y el perímetro del cuadrado a partir de la variable anteriormente creada.
        int areaCuadrado = ladoCuadrado * ladoCuadrado;
        int perimetroCuadrado = 4 * ladoCuadrado;
        
        // Crear una variable entera llamada “baseTriangulo” de valor 9.
        int baseTriangulo = 9;
        
        // Crear una variable entera llamada “alturaTriangulo” de valor 8.
        int alturaTriangulo = 8;
        
        // Crear dos variables enteras llamadas “ladoUnoTriangulo” y “ladoDosTriangulo” de valor 8 ambas.
        int ladoUnoTriangulo = 8;
        int ladoDosTriangulo = 8;
        
        // Calcular el área y el perímetro del triángulo a partir de variables anteriormente creadas.
        int areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        int perimetroTriangulo = baseTriangulo + ladoUnoTriangulo + ladoDosTriangulo;
        
        // Crear una variable entera llamada “baseRectangulo” de valor 8.
        int baseRectangulo = 8;
        
        // Crear una variable entera llamada “alturaRectangulo” de valor 6.
        int alturaRectangulo = 6;
        
        // Calcular el área y el perímetro del rectángulo a partir de variables anteriormente creadas.
        int areaRectangulo = baseRectangulo * alturaRectangulo;
        int perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);
        
        // Mostrar el resultado de las operaciones.
        System.out.println("Resultados:");
        System.out.println("Área del cuadrado: " + areaCuadrado);
        System.out.println("Perímetro del cuadrado: " + perimetroCuadrado);
        
        System.out.println("Área del triángulo: " + areaTriangulo);
        System.out.println("Perímetro del triángulo: " + perimetroTriangulo);
        
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
			

	}

}
