package CicloWhile;

public class Ejercicio3 {

	public static void main(String[] args) 
	{
		 // Definir el párrafo
        String parrafo = "Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas risus risus "
                + "pellentesque. Eros iaculis duis posuere integer purus euismod consequat. Vel congue curabitur penatibus "
                + "ac mus nisi iaculis; scelerisque feugiat blandit molestie euismod. Tincidunt risus sociis nostra "
                + "fermentum laoreet aliquet aptent est. Platea non proin aliquet scelerisque nam maecenas elit cum.";
        
        // Contadores para las vocales
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
        
        // Convertir el párrafo a minúsculas para simplificar el conteo
        parrafo = parrafo.toLowerCase();
        
        // Recorrer cada caracter del párrafo
        for (int i = 0; i < parrafo.length(); i++) {
            char c = parrafo.charAt(i);
            switch (c) {
                case 'a': contadorA++; break;
                case 'e': contadorE++; break;
                case 'i': contadorI++; break;
                case 'o': contadorO++; break;
                case 'u': contadorU++; break;
                default: // No hacer nada si no es una vocal
             break;
            }
        }
        
        // Mostrar los resultados
        System.out.println("Cantidad de vocales en el párrafo:");
        System.out.println("A: " + contadorA);
        System.out.println("E: " + contadorE);
        System.out.println("I: " + contadorI);
        System.out.println("O: " + contadorO);
        System.out.println("U: " + contadorU);
        int totalVocales = contadorA + contadorE + contadorI + contadorO + contadorU;
        System.out.println("Total de vocales: " + totalVocales);
		

	}

}
