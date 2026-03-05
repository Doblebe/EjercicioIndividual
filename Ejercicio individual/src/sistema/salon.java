package sistema;

public class salon {
    private int id;
    private String aula;
    private int piso;
    private int capacidad;
    private boolean disponible;

    public salon(int id, String aula, int piso, int capacidad, boolean disponible) {
        this.id = id;
        this.aula = aula;
        this.piso = piso;
        this.capacidad = capacidad;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public String getAula() {
        return aula;
    }

    public int getPiso() {
        return piso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarSalon() {
        System.out.println("Salón: " + aula + " - Piso: " + piso + " - Capacidad: " + capacidad);
    }
}
