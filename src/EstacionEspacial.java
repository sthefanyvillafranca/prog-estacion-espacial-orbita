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
