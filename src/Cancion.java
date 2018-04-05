public class Cancion implements Comparable<Cancion> {

    private final String TITULO;
    private final String AUTOR;
    private final int DURACION;

    public Cancion(String t, String a, int d) {
        TITULO = t;
        AUTOR = a;
        DURACION = d;
    }

    public String getTITULO() {
        return TITULO;
    }

    public String getAUTOR() {
        return AUTOR;
    }

    public int getDURACION() {
        return DURACION;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cancion) {
            Cancion cancion = (Cancion) obj;
            return cancion.AUTOR.equals(AUTOR) && cancion.TITULO.equals(TITULO)
                    && cancion.DURACION == DURACION;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("[title: %s,author: %s,duration %s]", TITULO, AUTOR, DURACION);
    }

    @Override
    public int compareTo(Cancion cancion){
        int s;
        if ((s = TITULO.compareTo(cancion.getTITULO())) == 0) {
            return AUTOR.compareTo(cancion.getAUTOR());
        }
        return s;
    }
}
