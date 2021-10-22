package biblioteca;

import lector.Lector;
import libro.Libro;

import java.util.Arrays;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    List<String[]> Copias = new ArrayList<>();
    List<Libro> Libros = new ArrayList<>();
    List<Lector> Prestamos = new ArrayList<>();

    void add_copia(String Libro,String Identificador,String State)  {
        for (libro.Libro libro : Libros) {
            if (Objects.equals(libro.getNombre(), Libro)) {
                Copias.add(new String[] {Libro,Identificador,State});
                libro.setCopias(libro.getCopias() + 1);
                break;
            }
        }
    }

    public void add_libro(String nombre, int ano, String autor, int copias) {
        Libro lib = new Libro(nombre, ano, autor, copias);
        for (libro.Libro libro : Libros)
            if (Objects.equals(libro.getNombre(), lib.getNombre())) return;
        Libros.add(lib);
    }

    int count_libro(String autor){
        int Co = 0;
        for (libro.Libro libro : Libros)
            if (Objects.equals(libro.getAutor(), autor))
                Co += libro.getCopias();
        return Co;
    }

    void prestar_libro(Lector lector,String nombre){
        boolean deuda = true;
        for (Lector prestamo : Prestamos) {
            if (Objects.equals(prestamo.getDni(), lector.getDni())) {
                if (lector.getPrestamo() == 3) return;
                else deuda = false;
                break;
            }
        } if(!deuda){
            for (libro.Libro libro : Libros) {
                if (Objects.equals(libro.getNombre(), nombre)) {
                    for(String[] c :Copias){
                        if(Objects.equals(c[0], nombre) && Objects.equals(c[2], "Free")){
                            lector.setPrestamo(lector.getPrestamo()+1);
                            c[2] = "Reverve";
                        }
                    }
                    break;
                }
            }
        }
    }

}
