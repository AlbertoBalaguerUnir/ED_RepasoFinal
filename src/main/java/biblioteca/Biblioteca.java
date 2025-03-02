package biblioteca;

// TODO: Documentar la clase.
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca con una colección de libros.
 * Permite agregar, eliminar y buscar libros pro título y autor.
 *
 * @see Libro (clase)
 * @author Alberto
 * @version 4.3.2025
 */

public class Biblioteca {

    // TODO: Documentar estos atributos
    /** Lista de libros disponibles en la biblioteca*/
    private final List<Libro> libros;

    // TODO: Documentar este método
    /** Constructor por defecto de la biblioteca sin libros*/
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO

    /**
     * Constructor con parámetros
     * @param libros lista de libros que inicializan
     */

    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado

    /**
     * Agregar libro a nuestra biblioteca
     * @param libro Un libro para agregar
     *
     * @return {@code true} si el libro se ha agregado correctamente o {@code flase} si el libro no se ha agregado
     * correctamente.
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método

    /**
     * Devuelve la lista de libros de la biblioteca.
     * @return lista de libros de la biblioteca.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     *
     * @param titulo
     * @return libro
     */

    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo

    /**
     * @deprecated Este metodo ha quedado obsoleto.
     * Se recomienda usar {@link #encuentraLibrosPorAutor(String)} en su lugar.
     * @param autor
     * @return libro.
     */

    @Deprecated
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente

    /**
     * Busca todos los libros de un autor determinado.
     * @since v2.0
     * Sustituye al metodo {@link #encuentraLibroPorTitulo(String)} en su lugar.
     * @param autor
     * @return
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}