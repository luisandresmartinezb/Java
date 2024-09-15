package EjercicioCiudad;

public class EjercicioCiudad {

	public static void main(String[] args) 
	{
		// Crear una instancia de Ciudad
        Ciudad ciudad = new Ciudad();
        
        
     // Inicializar los atributos usando los setters
        ciudad.setNombre("Madrid");
        ciudad.setPoblacion(9209940);
        ciudad.setPais("España");
        ciudad.setPresidente("Perro Sanchez");
        
        
        
     // Mostrar los datos almacenados usando los getters
        
        System.out.println("Información de la ciudad: ");
        System.out.println("Nombre: " + ciudad.getNombre());
        System.out.println("Población: " + ciudad.getPoblacion());
        System.out.println("País: " + ciudad.getPais());
        System.out.println("Presidente: " + ciudad.getPresidente());
 
	
	}

}
