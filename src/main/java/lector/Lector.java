package lector;

public class Lector {
    String dni;

    public Lector(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    int prestamo = 0; //max 3 libros

    public int getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(int prestamo) {
        this.prestamo = prestamo;
    }
}
