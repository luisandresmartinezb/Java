package Casa;

public class Main {

	public static void main(String[] args) 
	{
		 // Crear un objeto de la clase Casa usando el primer constructor
        Casa casa1 = new Casa("Madird", "Aluche", "Rojo");
        
        // Crear un objeto de la clase Casa usando el segundo constructor
        Casa casa2 = new Casa("Sol", "Marron", 3);
        
        // Crear un objeto de la clase Casa usando el tercer constructor
        Casa casa3 = new Casa(2, 5, 4, 1);

        // Mostrar la información de las casas usando los getters
        System.out.println("Casa 1:");
        System.out.println("Ciudad: " + casa1.getCiudad());
        System.out.println("Barrio: " + casa1.getBarrio());
        System.out.println("Color: " + casa1.getColor());

        System.out.println("\nCasa 2:");
        System.out.println("Barrio: " + casa2.getBarrio());
        System.out.println("Color: " + casa2.getColor());
        System.out.println("Pisos: " + casa2.getPisos());

        System.out.println("\nCasa 3:");
        System.out.println("Pisos: " + casa3.getPisos());
        System.out.println("Habitaciones: " + casa3.getHabitaciones());
        System.out.println("Baños: " + casa3.getBanos());
        System.out.println("Cocinas: " + casa3.getCocinas());
		
	}

}
