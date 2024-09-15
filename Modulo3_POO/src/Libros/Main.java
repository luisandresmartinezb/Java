package Libros;

public class Main {

	public static void main(String[] args) 
	{
		// Crear dos libros usando el constructor con parámetros
        Libro libro1 = new Libro("Gabriel Garcia Marquez", "Cien años de soledad", 482);
        Libro libro2 = new Libro("J.K. Rowling", "Harry Potter y la piedra filosofal", 309);
        
        
     // Mostrar la información de ambos libros
        libro1.mostrarLibro();
        libro2.mostrarLibro();

        // Comparar los libros por la cantidad de páginas
        Libro.compararLibros(libro1, libro2);
	}

}
