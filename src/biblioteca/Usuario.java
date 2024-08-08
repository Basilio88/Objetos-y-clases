
package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
     // Atributos privados
    private final String nombre;
    private final List<Libro> librosPrestados;

    // Constructor
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    // Métodos públicos
    public String getNombre() {
        return nombre;
    }

    public void prestarLibro(Libro libro) {
        if (libro.estaDisponible()) {
            libro.prestar();
            librosPrestados.add(libro);
        } else {
            System.out.println("El libro \"" + libro.getTitulo() + "\" no está disponible para prestar.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.remove(libro)) {
            libro.devolver();
        } else {
            System.out.println("El libro \"" + libro.getTitulo() + "\" no está en la lista de libros prestados por este usuario.");
        }
    }

    public void listarLibrosPrestados() {
        if (librosPrestados.isEmpty()) {
            System.out.println(nombre + " no tiene libros prestados.");
        } else {
            System.out.println(nombre + " tiene los siguientes libros prestados:");
            librosPrestados.forEach((libro) -> {
                System.out.println("- " + libro.getTitulo() + " por " + libro.getAutor());
            });
        }
    }
}
