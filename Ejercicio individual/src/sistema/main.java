package sistema;

public class main {
    public static void main(String[] args) {

        escuela escuela = new escuela(1, "CESDE", "Carlos Pérez");

        sistema.profesor profesor = new sistema.profesor(1, "Laura Gómez", "Java", true);

        sistema.salon salon = new sistema.salon(1, "A101", 1, 30, true);

        curso curso = new curso(1, "Programación Java", "Desarrollo", profesor, salon);

        estudiante estudiante = new estudiante(1, "Ariel", "Durán", "ariel@email.com", true);

        sistema.matricula matricula = new sistema.matricula(1, "03-03-2026", estudiante, curso, "Activa");

        escuela.mostrarEscuela();
        matricula.mostrarMatricula();
    }
}
