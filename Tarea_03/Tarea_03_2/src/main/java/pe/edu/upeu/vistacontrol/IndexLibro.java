package pe.edu.upeu.vistacontrol;

import pe.edu.upeu.modelo.Libro;
import pe.edu.upeu.utils.Lectura;

public class IndexLibro {
    public static void main(String[] args) {
        Lectura leer = new Lectura();

        System.out.print("> Título: ");
        String titulo = leer.cadena();
        System.out.print("> Autor: ");
        String autor = leer.cadena();
        System.out.print("> Editorial: ");
        String editorial = leer.cadena();
        System.out.print("> Páginas: ");
        int paginas = leer.entero();

        Libro libro = new Libro(titulo, autor, editorial, paginas);

        System.out.println("\nDATOS INGRESADOS");
        System.out.println("* Título: " + libro.getTitulo());
        System.out.println("* Autor: " + libro.getAutor());
        System.out.println("* Editorial: " + libro.getEditorial());
        System.out.println("* Páginas: " + libro.getPaginas());
    }
}