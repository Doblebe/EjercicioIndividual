package sistema;

public class profesor {
    private int id;
    private String nombre;
    private String especialidad;
    private boolean activo;

    public profesor(int id, String nombre, String especialidad, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void mostrarProfesor() {
        System.out.println("Profesor: " + nombre + " - Especialidad: " + especialidad);
    }
}
