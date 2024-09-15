package JavaUtilHashMap;

import java.util.HashMap;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		String texto = "java es un lenguaje de programación java es popular";

        // Convertimos la cadena de texto en un arreglo de palabras
        String[] palabras = texto.split(" ");

        // Creamos un HashMap para almacenar la frecuencia de cada palabra
        HashMap<String, Integer> frecuenciaPalabras = new HashMap<>();

        for (String palabra : palabras) {
            // Si la palabra ya existe en el HashMap, incrementamos su contador
            if (frecuenciaPalabras.containsKey(palabra)) {
                frecuenciaPalabras.put(palabra, frecuenciaPalabras.get(palabra) + 1);
            } else {
                // Si la palabra no existe en el HashMap, la añadimos con un contador inicial de 1
                frecuenciaPalabras.put(palabra, 1);
            }
        }

        // Imprimimos las palabras junto con su frecuencia
        for (String palabra : frecuenciaPalabras.keySet()) {
            System.out.println("Palabra: " + palabra + " - Frecuencia: " + frecuenciaPalabras.get(palabra));
        }

	}

}
