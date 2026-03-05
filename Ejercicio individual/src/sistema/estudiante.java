package sistema;

public class estudiante {
    // ATRIBUTOS
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private boolean activo;

    // CONSTRUCTOR
    public estudiante(int id, String nombre, String apellido, String email, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.activo = activo;
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActivo() {
        return activo;
    }

    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // MÉt
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido + " - Activo: " + activo);
    }
}
