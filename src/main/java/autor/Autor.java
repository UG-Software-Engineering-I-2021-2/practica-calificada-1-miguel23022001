package autor;

import java.util.Date;

public class Autor {
    String nombre;
    String born;

    public Autor(String nombre, String born) {
        this.nombre = nombre;
        this.born = born;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getBorn() {
        return born;
    }
}
