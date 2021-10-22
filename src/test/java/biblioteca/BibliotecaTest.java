package biblioteca;
import autor.Autor;
import lector.Lector;
import libro.Libro;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class BibliotecaTest {
    @Test
    public void test01(){
        Biblioteca BioAlert = new Biblioteca();
        Autor autor = new Autor("juan","12/02/1965");
        Libro l = new Libro("Pepe",2005,autor,0);
        BioAlert.add_libro(l);
    }

    @Test
    public void test02(){
        Biblioteca BioAlert = new Biblioteca();
        Autor autor = new Autor("juan","12/02/1965");
        Libro l = new Libro("Pepe",2005,autor,0);
        BioAlert.add_libro(l);
        BioAlert.add_copia("Pepe","1","Free");
    }

    @Test
    public void test03(){
        Biblioteca BioAlert = new Biblioteca();
        Autor autor = new Autor("juan","12/02/1965");
        Libro l = new Libro("Pepe",2005,autor,0);
        BioAlert.add_libro(l);
        BioAlert.count_libro("Pepe");
    }

    @Test
    public void test04(){
        Lector lector = new Lector("72216063");
        Assert.assertEquals(lector.getDni(),"72216063");
    }

    @Test
    public void test05(){
        Lector lector = new Lector("72216063");
        lector.setPrestamo(5);
        Assert.assertEquals(lector.getPrestamo(),5);
    }

    @Test
    public void test06(){
        Autor autor = new Autor("Juan", "12/06/1945");
        autor.setNombre("Miguel");
        Assert.assertEquals(autor.getNombre(),"Miguel");
    }

    // Stress tests
    @Test(threadPoolSize = 80, invocationCount = 10)
    public void StressTest01() {
        Biblioteca BioAlert = new Biblioteca();
        Autor autor = new Autor("juan","12/02/1965");
        Libro l = new Libro("Pepe",2005,autor,0);
        BioAlert.add_libro(l);
    }
    @Test(threadPoolSize = 80, invocationCount = 10)
    public void StressTest02() {
        Biblioteca BioAlert = new Biblioteca();
        Autor autor = new Autor("juan","12/02/1965");
        Libro l = new Libro("Pepe",2005,autor,0);
        BioAlert.add_libro(l);
        BioAlert.add_copia("Pepe","1","Free");
    }

    @Test(threadPoolSize = 80, invocationCount = 10)
    public void StressTest03() {
        Biblioteca BioAsert = new Biblioteca();
        Autor a1 = new Autor("juan","12/02/1965");
        Autor a2 = new Autor("michel","09/12/1980");
        Autor a3 = new Autor("Lucho","11/03/1989");
        Autor a4 = new Autor("Jose","22/07/2001");
        Libro l1 = new Libro("La nuez",2001,a1,0);
        Libro l2 = new Libro("La papa",1989,a2,0);
        Libro l3 = new Libro("La vaca",2011,a3,0);
        Libro l4 = new Libro("Piel",2020,a4,0);
    }

}
