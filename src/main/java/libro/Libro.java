package libro;

public class Libro {
    String nombre;
    int ano;
    String autor;
    int copias;

    public Libro(String nombre, int ano, String autor, int copias) {
        this.nombre = nombre;
        this.ano = ano;
        this.autor = autor;
        this.copias = copias;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAno() {
        return ano;
    }

    public String getAutor() {
        return autor;
    }
}
