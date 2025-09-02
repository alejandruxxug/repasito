public class PrestamoManager {
    private long idPrestamo;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private String estadoPrestamo;
    private static long contador = 0;

    public PrestamoManager(String fechaPrestamo, String fechaDevolucion, String estadoPrestamo) {
        this.idPrestamo = contador++;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estadoPrestamo = estadoPrestamo;
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
}
