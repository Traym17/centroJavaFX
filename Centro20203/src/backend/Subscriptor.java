package backend;

public class Subscriptor {
    private String nombre;
    private String identificacion;
    private String correo;
    private int estado;

    public Subscriptor(String nombre, String identificacion, String correo, int estado) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
