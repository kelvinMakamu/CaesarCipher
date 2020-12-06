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
  }

  public String getPlainText() {
    return this.plainText;
  }

  Object getCipherKey() {
    return 0;
  }
    
}
