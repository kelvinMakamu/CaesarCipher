/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author KMAKAMU
 */
public class EncodingTest {
    
    @Test
    public void Encoding_InstantiatingClass(){
      Encoding encode = new Encoding();
      assertEquals(true, encode instanceof Encoding);
    }
    
}
