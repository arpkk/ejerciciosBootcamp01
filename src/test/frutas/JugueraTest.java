package test.frutas;
import main.frutas.Juguera;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JugueraTest {

    @Test
    public void agregarFruta(){
        Juguera manzana1 = new Juguera(200);
        String respuesta= manzana1.agregarFruta("Manzana", 0);
        assertEquals(0,manzana1.getMlManzana(),1e-15);
        assertEquals("Agregue Manzana",respuesta);

    }

    @Test
    public void agregarDosFrutas(){
        Juguera juguera= new Juguera(500);
        String respuesta= juguera.agregarFruta("Manzana",200);
        String respuesta2= juguera.agregarFruta("Pera",300);
        boolean respuesta3= juguera.seRebalsa();
        assertEquals(true,respuesta3);
    }
}
