/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
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
   String words[] = this.getEncodedText().split(" ");
   List<String> reconstructed = new ArrayList<>();
   for(String word: words){
      List<String> morphedWord = new ArrayList<>();
      char [] letters = word.toCharArray();
      for(char letter: letters){
        if(listItems.contains(letter)){
         int newIndex  = (listItems.indexOf(letter)-this.cipherKey)%alphabets.length;
          morphedWord.add(String.valueOf(alphabets[newIndex]));
        }else{
          morphedWord.add(String.valueOf(letter));
        }
      }
      reconstructed.add(String.join("",morphedWord));
   }
   return String.join(" ",reconstructed);
  }
  
}
