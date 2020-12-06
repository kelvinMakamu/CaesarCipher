package caesar;

import java.util.Scanner;
import models.Decoding;
import models.Encoding;

public class Caesar {
    /**
     * @param args the command line arguments
     */
    private static final String ERROR_RULE = "Please provide any digit between 1 and 25 (inclusive) as the cipher key";
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a phrase to encrypt");
      String phrase = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
//      String phrase = input.next();
      System.out.println("Please enter a cipher key (1-25)");
      int cipherKey = 23;
//      int cipherKey = input.nextInt();
      Encoding encoding = new Encoding(phrase,cipherKey);
      if(encoding.isValidKey()){
        Decoding decoding = new Decoding(encoding.encodePlainText(),cipherKey);
        System.out.println("Input String: "+encoding.getPlainText());
        System.out.println("Encrypted String: "+encoding.encodePlainText());
        System.out.println("Decrypted String: "+decoding.decodeEncodedText());
      }else{
        System.out.println(ERROR_RULE);
      }
    }
}
