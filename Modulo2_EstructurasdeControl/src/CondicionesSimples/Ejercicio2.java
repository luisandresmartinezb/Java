package CondicionesSimples;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		// dos números enteros 
        int num1 = 5;
        int num2 = 3;

        int mayor, menor;

        // Determinar cuál es el mayor y cuál es el menor
        if (num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }

        // Realizar la potencia con el número menor como exponente
        double potencia = Math.pow(mayor, menor);

        // Mostrar los resultados
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("La potencia de " + mayor + " elevado a " + menor + " es: " + potencia);
		
	}

}
