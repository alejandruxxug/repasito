import java.util.ArrayList;

public class Autor {
    private String name;
    private String nacionalidad;
    private long id;
    private static long contador = 0;
    ArrayList<Libro> libros = new ArrayList<>();

    public Autor(String name, String nacionalidad) {
        this.name = name;
        this.nacionalidad = nacionalidad;
        this.id = contador++;
    }

    public Autor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public long getId() {
        return id;
    }

    public void anadirLibro(Libro libro) {
        libros.add(libro);
    }
}
