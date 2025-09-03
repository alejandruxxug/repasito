public class PrestamoManager {
    private long idPrestamo;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private String estadoPrestamo;
    private static long contador = 0;
    private Libro libro;
    private Usuario usuario;

    public PrestamoManager(String fechaPrestamo, String estadoPrestamo, Libro libro, Usuario usuario) {
        this.idPrestamo = contador++;
        this.fechaPrestamo = fechaPrestamo;
        this.estadoPrestamo = estadoPrestamo;
        this.libro = libro;
        this.usuario = usuario;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(String estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }

    public long getIdPrestamo() {
        return idPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
