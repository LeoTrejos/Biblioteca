public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        // Crear algunos libros de ejemplo
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", "9789871926693", "Emecé Editores", 1943, 250.0);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "9788437604947", "Diana", 1967, 300.0);

        // Agregar libros al inventario
        libreria.agregarLibro(libro1);
        libreria.agregarLibro(libro2);

        // Mostrar el inventario
        libreria.mostrarInventario();

        // Buscar libro por título
        Libro libroEncontrado = libreria.buscarLibroPorTitulo("El principito");
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado.getTitulo());
        } else {
            System.out.println("Libro no encontrado.");
        }

        // Buscar libros por autor
        System.out.println("Libros del autor Gabriel García Márquez:");
        libreria.buscarLibroPorAutor("Gabriel García Márquez");
    }
}
