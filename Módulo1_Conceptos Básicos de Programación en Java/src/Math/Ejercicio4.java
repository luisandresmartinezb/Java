package Math;

public class Ejercicio4 {

	public static void main(String[] args) 
	{
		// Generar 2 números decimales aleatorios entre 1 y 50
        double numero1 = 1 + Math.random() * 49;
        double numero2 = 1 + Math.random() * 49;

        // Redondear los números usando Math.round
        long redondeado1 = Math.round(numero1);
        long redondeado2 = Math.round(numero2);

        // Calcular el número mayor utilizando Math.max
        long mayor = Math.max(redondeado1, redondeado2);

        // Mostrar los números generados, redondeados y el mayor
        System.out.println("Número 1 generado: " + numero1);
        System.out.println("Número 2 generado: " + numero2);
        System.out.println("Número 1 redondeado: " + redondeado1);
        System.out.println("Número 2 redondeado: " + redondeado2);
        System.out.println("El número mayor entre ambos es: " + mayor);

	}

}
