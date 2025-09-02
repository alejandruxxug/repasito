import java.util.ArrayList;

public class Libro {
    private long id;
    private static long contador = 0;
    private String titulo;
    private String genero;
    private String anopublicacion;
    private boolean disponible;
    private Autor autor;
    ArrayList<PrestamoManager> fuePrestadoA = new ArrayList<>();

    public Libro(String titulo, String genero, String anopublicacion, boolean disponible, Autor autor) {
        this.id = contador++;
        this.titulo = titulo;
        this.genero = genero;
        this.anopublicacion = anopublicacion;
        this.disponible = disponible;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnopublicacion() {
        return anopublicacion;
    }

    public void setAnopublicacion(String anopublicacion) {
        this.anopublicacion = anopublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public long getId() {
        return id;
    }
}
