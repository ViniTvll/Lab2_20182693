import java.util.ArrayList;
import java.util.Arrays;

public class Ahorcado {
    private String longitud;
    private String maxint;
    private ArrayList tema;

    public ArrayList getTema() {
        return tema;
    }

    public void setTema(ArrayList tema) {
        this.tema = tema;
    }

    public Ahorcado(String longitud, String maxint, ArrayList tema) {

        this.longitud = longitud;
        this.maxint = maxint;
        this.tema = tema;
}

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getMaxint() {
        return maxint;
    }

    public void setMaxint(String maxint) {
        this.maxint = maxint;
    }
}
