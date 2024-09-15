package CicloWhile;

public class Ejercicio4 {

	public static void main(String[] args) 
	{
		int numero = 11; // Primer valor de la serie
        int incremento = 11; // Incremento constante en la serie
        
        System.out.println("Los primeros 25 valores de la serie son:");
        
        // Generar y mostrar los primeros 25 valores de la serie
        for (int i = 1; i <= 25; i++) {
            System.out.println(numero);
            numero += incremento; // Sumar 11 al número actual en cada iteración
        }

	}

}
