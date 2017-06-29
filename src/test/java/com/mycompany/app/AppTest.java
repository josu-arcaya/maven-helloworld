package com.mycompany.app;

import org.junit.Test;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void sumaTest() {
      App a = new App();
      Assert.assertEquals(a.suma(5,6),11);
    }

    @Test
    public void sumaTest2() {
      App a = new App();
      Assert.assertEquals(a.suma(5,1),6);
    }

    @Test
    public void restaTest() {
      App a = new App();
      Assert.assertEquals(a.resta(5,1),4);
    }
}
