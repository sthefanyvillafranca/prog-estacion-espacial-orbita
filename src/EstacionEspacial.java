package PACKAGE_NAME;

public class EstacionEspacial {

    private Nave[] navesAtracadas;
    private final int NUM_MAX_NAVES;


    /**
     * Metodo constructor
     * @return EstacionEspacial
     */
    public EstacionEspacial() {

        NUM_MAX_NAVES = 20;
        navesAtracadas = new Nave[NUM_MAX_NAVES];

    }


    /**
     * Recorre las plataformas
     * @param id
     * @return Devuelve la nave con ese id o null si no la encuentra.
     */
    public Nave buscarNave(int id) {
        return null;
    }


    /**
     * Metodo que busca la primera bahía libre
     * @return devuelve la primera posicion null o si la estación está llena, devuelve -1.
     */
    private int buscarPrimeraBahiaLibre() {
        return 0;
    }


    /**
     * Metodo que solo permite atracar si NO hay otra nave con el mismo id, y si hay al menos una bahía libre
     * @param nave
     * @return Devuelve true si el atraque es exitoso, false en caso contrario.
     */
    public boolean atracarNave(Nave nave) {
        return false;
    }


    /**
     * Metodo que muestra la flota de naves.
     * @return devuelve un String (usando StringBuilder) mostrando las naves.
     */
    public String mostrarFlota() {
        return null;
    }


    /**
     * Metodo que cuenta cuántas naves existen actualmente en el array
     * @return  Devuelve el número exacto de naves existentes.
     */
    public int contarNavesAtracadas() {
        return 0;
    }
}

/**
 * Flota atracada: grupo de naves que están estacionadas o guardadas dentro de la estación espacial en ese momento exacto.
 */