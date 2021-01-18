/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupowka;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author xXx
 */
public class Grupowka {


   public static void main(String args[]) throws Exception{

      int count =0;
      File file = new File("C:\\Users\\Grzegorz\\Documents\\NetBeansProjects\\grupowka\\Grupowka\\src\\grupowka\\data.txt");
      FileInputStream fis = new FileInputStream(file);
      byte[] bytesArray = new byte[(int)file.length()];
      fis.read(bytesArray);
      String s = new String(bytesArray);
      String [] data = s.split(" ");
      for (int i=0; i<data.length; i++) {
         count++;
      }
      System.out.println("Ilosc slow w pliku " +count);
   }
    
}
