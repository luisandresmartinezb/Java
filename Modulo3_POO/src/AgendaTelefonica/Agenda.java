package AgendaTelefonica;

public class Agenda 
{
	private Contacto[] contactos;
    private int contador; // Para llevar la cuenta de contactos añadidos

    // Constructor que inicializa el vector con 10 espacios
    public Agenda() {
        contactos = new Contacto[10];
        contador = 0;
    }

    // Método para registrar un contacto en la agenda
    public void registrarContacto(Contacto contacto) {
        if (contador < contactos.length) {
            contactos[contador] = contacto;
            contador++;
            System.out.println("Contacto registrado con éxito.");
        } else {
            System.out.println("La agenda está llena. No se pueden agregar más contactos.");
        }
    }

    // Método para listar todos los contactos
    public void listarContactos() {
        System.out.println("Lista de contactos:");
        for (int i = 0; i < contador; i++) {
            System.out.println(contactos[i].toString());
        }
    }

    // Método para buscar un contacto por nombre
    public void buscarContacto(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Contacto encontrado: " + contactos[i].toString());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

    // Método para mostrar los espacios disponibles para registrar contactos
    public void disponibles() {
        int disponibles = contactos.length - contador;
        System.out.println("Espacios disponibles en la agenda: " + disponibles);
    }
	
}
