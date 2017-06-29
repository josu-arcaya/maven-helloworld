package com.mycompany.app;

import org.junit.Test;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppIT
{
    @Test
    public void restaSumaTest() {
      App a = new App();
      Assert.assertEquals(a.resta(5,1),4);
      Assert.assertEquals(a.suma(5,1),6);
    }
}
