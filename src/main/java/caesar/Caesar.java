package caesar;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        caesarCipherIntoFile(encoding.encodePlainText(),encoding.getCipherKey(),decoding.decodeEncodedText());
      }else{
        System.out.println(ERROR_RULE);
      }
    }
    
    public static void caesarCipherIntoFile(String encodedText,int cipherKey,
      String plainText){
      try {
          FileWriter encryptor = new FileWriter("encodedText.txt");
          encryptor.write("Cipher Key: "+cipherKey+"\n");
          encryptor.write("Input String: "+plainText+"\n");
          encryptor.write("Encrypted String: "+encodedText+"\n");
          encryptor.close();
          System.out.println("Successfully wrote to the file.");
          File myObj       = new File("encodedText.txt");
          Scanner myReader = new Scanner(myObj);
          while (myReader.hasNextLine()) {
            FileWriter decoder = new FileWriter("decodedText.txt");
            decoder.write("Cipher Key: "+cipherKey+"\n");
            decoder.write("Encrypted String: "+encodedText+"\n");
            decoder.write("Decrypted String: "+plainText+"\n");
            decoder.close();
          }
          myReader.close();
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
}
