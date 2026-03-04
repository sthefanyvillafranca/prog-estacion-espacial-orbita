package PACKAGE_NAME;

public class Nave {

    private int id;
    private String nombre;
    private String clase;
    private int capacidadTripulantes;

    /**
     * Metodo constructor
     * @param id
     * @param nombre
     * @param clase
     * @param capacidadTripulantes
     * @return Nave
     */
    public Nave (int id, String nombre, String clase, int capacidadTripulantes) {
        this.id = id;
        this.nombre = nombre;
        this.clase = clase;
        this.capacidadTripulantes = capacidadTripulantes;
    }


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClase() {
        return clase;
    }

    public int getCapacidadTripulantes() {
        return capacidadTripulantes;
    }


    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Nave: (");
        sb.append(id);
        sb.append(", ");
        sb.append(nombre);
        sb.append(", ");
        sb.append(clase);
        sb.append(", ");
        sb.append(capacidadTripulantes);
        sb.append(")");
        return sb.toString();
    }
}
