package pe.edu.upeu.modelo;

public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int paginas;

    public Libro(String titulo, String autor, String editorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public int getPaginas() {
        return paginas;
    }
}