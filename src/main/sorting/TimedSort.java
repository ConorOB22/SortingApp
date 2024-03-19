package main.sorting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/****
 ***** Created by CONOR O'BOYLE ON 12/03/2024
 ***** UPDATE PROGRAM DESCRIPTION HERE
 ****/
public interface TimedSort extends Sort
{
    default void doTimedSortNano(int[] data) {

        long startTime = 0, endTime = 0, time = 0;
        startTime = System.nanoTime();

        sort(data);
        System.out.println("The sorted array is: "+ Arrays.toString(data));
        System.out.println();

        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("Time = " + time);

    }//doTimedSortNano

//    default int getNumberOfLines(String fileName) throws IOException
//    {
//        try
//        {
//            FileReader fr = new FileReader(fileName);
//            BufferedReader br = new BufferedReader(fr);
//            String s = br.readLine();
//            int numberOfLines = 0;
//
//            while (s != null)
//            {
//                numberOfLines++;
//                s = br.readLine();
//            }//while
//            return numberOfLines;
//        } catch (IOException e)
//        {
//            throw new RuntimeException(e);
//        }
//    }//getNumberOfLines
//
//    default int[] readInLines(int numberOfLines,String fileName) throws IOException
//    {
//
//        FileReader fr = new FileReader(fileName);
//        BufferedReader br = new BufferedReader(fr);
//
//        int [] number = new int [numberOfLines];
//
//        for (int i = 0; i < number.length; i++) {
//            String s = br.readLine();
//            int currentLineNumber = Integer.parseInt(s);
//            number[i] = currentLineNumber;
//        }
//        br.close(); // close buffered reader stream
//        fr.close(); // close the file stream
//        return number;
//    }//readInLines
}//class