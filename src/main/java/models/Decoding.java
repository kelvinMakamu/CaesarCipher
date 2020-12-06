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
  
  public Decoding(String encodedText, int cipherKey) {
    this.encodedText = encodedText;
    this.cipherKey   = cipherKey;
  }

  public String getEncodedText() {
   return this.encodedText;
  }

  public int getCipherKey() {
    return this.cipherKey;
  }
  
}
