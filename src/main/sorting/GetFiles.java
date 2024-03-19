package main.sorting;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/****
 ***** Created by CONOR O'BOYLE ON 18/03/2024
 ***** UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class GetFiles
{
   public static void createFiles () throws IOException {

      getAverageCase("Average1000.txt", 1000);
      getAverageCase("Average1000_2.txt", 1000);
      getAverageCase("Average1000_3.txt", 1000);

      getAverageCase("Average10000.txt", 10000);
      getAverageCase("Average10000_2.txt", 10000);
      getAverageCase("Average10000_3.txt", 10000);

      getAverageCase("Average100000.txt", 100000);
      getAverageCase("Average100000_2.txt", 100000);
      getAverageCase("Average100000_3.txt", 100000);
   }

   public static void getAverageCase(String name, int size) throws IOException {      //method to write partially random numbers to file
      Random r = new Random();
      FileWriter fw = new FileWriter(name);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter pw = new PrintWriter(bw);

      for (int i = 0; i < size; i++){
         pw.println(r.nextInt(1000)+1);
      }
      pw.close();bw.close();fw.close();
   }//getAverageCase

}//class
