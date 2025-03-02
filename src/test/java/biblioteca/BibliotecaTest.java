package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro;
    Biblioteca biblioteca;

    @BeforeEach
    void setUp() {
        libro = new Libro("The Art of Computer Programming", "Donald Knuth", 1968);
    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(this.libro));
    }

    @Test
    void eliminarLibro() {
    }

    @Test
    void getLibros() {
    }

    @Test
    void encuentraLibroPorTitulo() {
    }

    @Test
    void encuentaLibroPorAutor() {
    }

    @Test
    void encuentraLibrosPorAutor() {
        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(this.libro);

        //Comprobamos que no está vacía.
        assertNotNull(biblio.getLibros());

        //Comprobamos que sólo tiene un libro
        assertEquals(biblio.getLibros().size(), 1);

        //Comprobamos que contiene el libro recién añadido.
        assertTrue(biblio.getLibros().contains(this.libro));

    }




}