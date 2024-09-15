package AgendaTelefonica;

public class Contacto 
{
	private String nombre;
    private String numero;

    // Constructor por defecto
    public Contacto() {}

    // Constructor con parámetros
    public Contacto(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Método toString para mostrar los detalles del contacto
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Número: " + numero;
    }

}
