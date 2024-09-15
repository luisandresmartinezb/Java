package Libros;

public class Libro 
{
	// Atributos
    private String autor;
    private String titulo;
    private int paginas;

    // Constructor por defecto
    public Libro() {
    }

    // Constructor con parámetros
    public Libro(String autor, String titulo, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    // Getters y Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    // Método mostrarLibro()
    public void mostrarLibro() {
        System.out.println("El libro " + titulo + ", del autor " + autor + ", tiene " + paginas + " páginas.");
    }

    // Método compararLibros() (estático)
    public static void compararLibros(Libro libro1, Libro libro2) {
        if (libro1.getPaginas() > libro2.getPaginas()) {
            System.out.println("El libro con más páginas es: " + libro1.getTitulo());
        } else if (libro2.getPaginas() > libro1.getPaginas()) {
            System.out.println("El libro con más páginas es: " + libro2.getTitulo());
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de páginas.");
        }
	
	
    }
}
