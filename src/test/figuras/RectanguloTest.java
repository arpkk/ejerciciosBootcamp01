package test.figuras;

import main.figuras.Rectangulo;
import org.junit.Assert;
import org.junit.Test;

public class RectanguloTest {
    @Test
    public void area(){
        Rectangulo rectangulo1 = new Rectangulo(3,10);
        Assert.assertEquals(30, rectangulo1.area());
    }

    @Test
    public void cuadradoarea() {
        Rectangulo cuadrado1 = new Rectangulo(6,6);
        Assert.assertEquals(36, cuadrado1.area());
    }
}
