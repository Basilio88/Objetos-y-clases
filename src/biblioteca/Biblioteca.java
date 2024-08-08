
package biblioteca;


public class Biblioteca {

    
    public static void main(String[] args) {
        // Crear instancias de Libro
        Libro libro1 = new Libro("Administrndo Imperii", "Miguel Porfirogeneta");
        Libro libro2 = new Libro("Topografía Cristiana", "Cosmas Indicopleustes");
        Libro libro3 = new Libro("El Libro de las maravillas", "Marco Polo");

        // Crear instancia de Usuario
        Usuario usuario = new Usuario("Anyer Félix");

        // Pruebas de préstamos y devoluciones
        usuario.prestarLibro(libro1);
        usuario.prestarLibro(libro2);
        usuario.prestarLibro(libro1); // Intentar prestar un libro ya prestado

        usuario.listarLibrosPrestados();

        usuario.devolverLibro(libro1);
        usuario.devolverLibro(libro1); // Intentar devolver un libro que no está prestado

        usuario.listarLibrosPrestados();
    }
    
}
