public class Cancion {

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
}
