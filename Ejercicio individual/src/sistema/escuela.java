package sistema;

public class escuela {
    private int id;
    private String nombre;
    private String director;

    public escuela(int id, String nombre, String director) {
        this.id = id;
        this.nombre = nombre;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void mostrarEscuela() {
        System.out.println("Escuela: " + nombre + " - Director: " + director);
    }
}
