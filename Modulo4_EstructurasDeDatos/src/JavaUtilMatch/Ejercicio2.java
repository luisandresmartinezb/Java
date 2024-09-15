package JavaUtilMatch;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		 // Crear un TreeMap
        Map<String, String> capitales = new TreeMap<>();

        // Agregar elementos al TreeMap
        capitales.put("España", "Madrid");
        capitales.put("Francia", "París");
        capitales.put("Italia", "Roma");

        // Imprimir el TreeMap
        System.out.println("Capitales: " + capitales);

        // Obtener y mostrar la capital de Italia
        String capitalItalia = capitales.get("Italia");
        System.out.println("La capital de Italia es: " + capitalItalia);

        // Comprobar si una clave existe
        if (capitales.containsKey("España")) {
            System.out.println("España está en el TreeMap.");
        }

        // Recorrer el TreeMap
        for (Map.Entry<String, String> entrada : capitales.entrySet()) {
            System.out.println("La capital de " + entrada.getKey() + " es " + entrada.getValue() + ".");
        }
            
	}

}
