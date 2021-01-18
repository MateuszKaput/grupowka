/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupowka;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author xXx
 */
public class Grupowka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
    
      
      System.out.println("Podaj scierzke do pliku: ");
      Scanner scan = new Scanner(System.in);
      String scierzka = scan.next();
      Boolean czyexit = false;

      while(!czyexit)
      {
                while(scierzka.equals("") || scierzka == null)
                {
                  System.out.println("Nie podano wartosci, po pomoc wpisz : help ");
                }

                if(scierzka.equals("help"))
                {
                  System.out.println("Mozliwe komendy: ");
                  System.out.println("exit - wyjście z programu ");
                }
                
                if(scierzka.equals("exit"))
                {
                    czyexit = true;
                    break;
                }

                try
                {
                        int count =0;
                        File file = new File(scierzka);
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
                catch(FileNotFoundException e)
                {
                   System.out.println("Niepoprawna scierzka ");
                }
                
             scierzka = scan.next();
      }
   }
    
}
