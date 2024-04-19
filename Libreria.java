import java.util.HashMap;

public class Libreria {
    private HashMap<String, Libro> inventario;

    // Constructor
    public Libreria() {
        this.inventario = new HashMap<>();
    }

    // Método para agregar un libro al inventario
    public void agregarLibro(Libro libro) {
        if (!inventario.containsKey(libro.getTitulo())) {
            inventario.put(libro.getTitulo(), libro);
            System.out.println("Libro agregado al inventario.");
        } else {
            System.out.println("El libro ya existe en el inventario.");
        }
    }

    // Método para buscar un libro por título
    public Libro buscarLibroPorTitulo(String titulo) {
        return inventario.get(titulo);
    }

    // Método para buscar un libro por autor
    public void buscarLibroPorAutor(String autor) {
        boolean encontrado = false;
        for (Libro libro : inventario.values()) {
            if (libro.getAutor().equals(autor)) {
                System.out.println(libro.getTitulo() + " - " + libro.getAutor());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros del autor especificado.");
        }
    }

    // Método para mostrar el inventario de la librería
    public void mostrarInventario() {
        System.out.println("Inventario de la librería:");
        for (Libro libro : inventario.values()) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
        }
    }
}
