package Seguridad;

public class Main {

	public static void main(String[] args) 
	{
		 // Crear una instancia de Password con longitud por defecto
        Password passDefecto = new Password();
        System.out.println("Contraseña generada (longitud 10): " + passDefecto.getPassword());
        System.out.println("¿Es segura? " + (passDefecto.validar() ? "Sí" : "No"));

        // Crear una instancia de Password con longitud específica
        Password passCustom = new Password(15);
        System.out.println("\nContraseña generada (longitud 15): " + passCustom.getPassword());
        System.out.println("¿Es segura? " + (passCustom.validar() ? "Sí" : "No"));
		

	}

}
