package sistema;

public class curso {
    private int id;
    private String nombre;
    private String programa;
    private sistema.profesor profesor;
    private sistema.salon salon;

    public curso(int id, String nombre, String programa, sistema.profesor profesor, sistema.salon salon) {
        this.id = id;
        this.nombre = nombre;
        this.programa = programa;
        this.profesor = profesor;
        this.salon = salon;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public sistema.profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(sistema.profesor profesor) {
        this.profesor = profesor;
    }

    public void mostrarCurso() {
        System.out.println("Curso: " + nombre + " - Programa: " + programa);
        profesor.mostrarProfesor();
        salon.mostrarSalon();
    }
}
