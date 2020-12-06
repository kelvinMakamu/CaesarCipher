/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author macbookpro
 */
public class Decoding {
  
  private String encodedText;
  private int cipherKey;
  
  private final Character [] alphabets = {'A','B','C','D','E','F','G','H','I','J','K',
      'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
  private final List<Character> listItems = Arrays.asList(alphabets);
  
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
  
  public String decodeEncodedText() {
   char first    = this.getEncodedText().charAt(0);
   int newIndex  = (listItems.indexOf(first) - this.cipherKey)%alphabets.length;
   return String.valueOf(alphabets[newIndex]);
  }
  
}
