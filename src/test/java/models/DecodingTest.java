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
 * @author macbookpro
 */
public class DecodingTest {
  
  @Test
  public void Decoding_Instantiation(){
    Decoding decode = new Decoding("C",2);
    assertEquals(true,decode instanceof Decoding);
  }
  
  @Test
  public void Decoding_getsEncodedText(){
    Decoding decode = new Decoding("C",2);
    String expected = "C";
    assertEquals(expected,decode.getEncodedText());
  }
  
  @Test
  public void Decoding_getsCipherKey(){
    Decoding decode = new Decoding("C",2);
    int expected    = 2;
    assertEquals(expected,decode.getCipherKey());
  }
  
  @Test
  public void decodeEncodedText_OneLetterWord_A(){
    Decoding decode = new Decoding("C",2);
    String expected = "A";
    assertEquals(expected,decode.decodeEncodedText());
  }
  
  @Test
  public void decodeEncodedText_TwoLetterWord_AB(){
    Decoding decode  = new Decoding("CD",2);
    String expected  = "AB";
    assertEquals(expected,decode.decodeEncodedText());
  }
  
  @Test
  public void decodeEncodedText_ManyLetterWord_ABCD(){
    Decoding decode  = new Decoding("CDEF",2);
    String expected  = "ABCD";
    assertEquals(expected,decode.decodeEncodedText());
  }
  
  @Test
  public void decodeEncodedText_IgnoringNonCharacters_AB1D(){
    Decoding decode = new Decoding("CD1F",2);
    String expected = "AB1D";
    assertEquals(expected,decode.decodeEncodedText());
  }
}
