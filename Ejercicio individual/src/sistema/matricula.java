package sistema;

import sistema.curso;
import sistema.estudiante;

public class matricula {
    private int id;
    private String fecha;
    private estudiante estudiante;
    private curso curso;
    private String estado;

    public matricula(int id, String fecha, estudiante estudiante, curso curso, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.estudiante = estudiante;
        this.curso = curso;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarMatricula() {
        System.out.println("Matrícula ID: " + id + " - Fecha: " + fecha);
        estudiante.mostrarInfo();
        curso.mostrarCurso();
        System.out.println("Estado: " + estado);
    }
}
