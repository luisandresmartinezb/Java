package CicloWhile;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		String palabra = "Programación";
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
        
        System.out.println("Palabra original: " + palabra);
        System.out.println("Palabra invertida: " + palabraInvertida);

	}

}
