/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author KMAKAMU
 */
public class Encoding {
  
  private String plainText;
  private int cipherKey;
  
  public Encoding(String plainText, int cipherKey) {
    this.plainText = plainText;
    this.cipherKey = cipherKey;
  }

  public String getPlainText() {
    return this.plainText;
  }

  public int getCipherKey() {
    return this.cipherKey;
  }

  public boolean isValidKey() {
    return (this.cipherKey >0 && this.cipherKey <=25);
  }

  public String encodePlainText() {
    return null;
  }
    
}
