package JavaUtilMatch;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		 // Crear un HashMap
        Map<String, Integer> edades = new HashMap<>();

        // Agregar elementos al HashMap
        edades.put("Juan", 25);
        edades.put("Ana", 30);
        edades.put("Luis", 28);

        // Imprimir el HashMap
        System.out.println("Edades: " + edades);

        // Obtener y mostrar la edad de Ana
        int edadAna = edades.get("Ana");
        System.out.println("La edad de Ana es: " + edadAna);

        // Comprobar si una clave existe
        if (edades.containsKey("Luis")) {
            System.out.println("Luis está en el HashMap.");
        }

        // Recorrer el HashMap
        for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
            System.out.println(entrada.getKey() + " tiene " + entrada.getValue() + " años.");
        }
		
		
	}

}
