
package biblioteca;

public class Libro {
    // Atributos privados
    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; // Inicialmente, el libro está disponible
    }

    // Métodos públicos
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
        } else {
            System.out.println("El libro \"" + titulo + "\" no está disponible para prestar.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("El libro \"" + titulo + "\" ha sido devuelto y ahora está disponible.");
    } 
}
