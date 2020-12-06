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
      Encoding encode = new Encoding("A",2);
      assertEquals(true, encode instanceof Encoding);
    }
    
    @Test
    public void Encoding_getsPlainText_A(){
      Encoding encode = new Encoding("A",2);
      String expected = "A";
      assertEquals(expected,encode.getPlainText());
    }
    
    @Test
    public void Encoding_getsCipherKey_2(){
      Encoding encode = new Encoding("A",2);
      int expected    = 2;
      assertEquals(expected,encode.getCipherKey());
    }
    
    @Test
    public void isValidKey_WhenInvalidKey_FALSE(){
      Encoding encode  = new Encoding("A",29);
      boolean expected = false;
      assertEquals(expected,encode.isValidKey());
    }
    
    @Test
    public void isValidKey_WhenValidKey_TRUE(){
      Encoding encode  = new Encoding("A",1);
      boolean expected = true;
      assertEquals(expected,encode.isValidKey());
    }
    
    @Test
    public void encodePlainText_OneLetterWord_C(){
      Encoding encode  = new Encoding("A",2);
      String expected  = "C";
      assertEquals(expected,encode.encodePlainText());
    }
    
    @Test
    public void encodePlainText_TwoLetterWord_CD(){
      Encoding encode  = new Encoding("AB",2);
      String expected  = "CD";
      assertEquals(expected,encode.encodePlainText());
    }
    
    @Test
    public void encodePlainText_ManyLetterWord_CDEF(){
      Encoding encode  = new Encoding("ABCD",2);
      String expected  = "CDEF";
      assertEquals(expected,encode.encodePlainText());
    }
    
    @Test
    public void encodePlainText_IgnoringNonCharacters_CD1F(){
       Encoding encode = new Encoding("AB1D",2);
      String expected  = "CD1F";
      assertEquals(expected,encode.encodePlainText());
    }
    
}
