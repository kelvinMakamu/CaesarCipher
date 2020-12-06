/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author macbookpro
 */
public class Decoding {
  
  private String encodedText;
  private int cipherKey;
  
  Decoding(String encodedText, int cipherKey) {
    this.encodedText = encodedText;
  }

  public String getEncodedText() {
   return this.encodedText;
  }
  
}
