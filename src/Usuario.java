import java.util.ArrayList;

public class Usuario {
    private long id;
    private String nombre;
    private String correo;
    private String telefono;
    private static long contador = 0;
    ArrayList<PrestamoManager> prestoEste = new ArrayList<>();

    public Usuario(String nombre, String correo, String telefono) {
        this.id = contador++;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public long getId() {
        return id;
    }
}
