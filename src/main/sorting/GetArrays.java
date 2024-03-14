package main.sorting;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

/****
 ***** Created by CONOR O'BOYLE ON 14/03/2024
 ***** UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class GetArrays
{
    public static int[] getSortedArray(int length)
    {
        int[] sortedArray = new int[length];

        for (int i = 0; i < sortedArray.length; i++)
        {
            sortedArray[i] = i + 1;
        }
//        System.out.println(Arrays.toString(sortedArray));
        return sortedArray;
    }//getSortedArray

    public static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] randomArray = new int[length];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(length + 1);
        }

        return randomArray;
    }//getRandomArray


    public static int[] getReversedArray(int length) {
        int[] reversedArray = new int[length];

        for(int i = 0; i < length; i++) {
            reversedArray[i] = length - i;
        }
        return reversedArray;
    }//getReversedArray


    public static void printArray(int[] array, String fileName) throws IOException
    {
        try
        {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);


//            System.out.println("Array before sort: " + Arrays.toString(array));
            pw.println("\"Array before sort: " + Arrays.toString(array));

            pw.close();
            bw.close();
            fw.close();
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }//printArray

    public static int getNumberOfLines(String fileName) throws IOException
    {
        try
        {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            int numberOfLines = 0;

            while (s != null)
            {
                numberOfLines++;
                s = br.readLine();
            }//while
            return numberOfLines;
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }//getNumberOfLines

    public static int[] readInLines(int numberOfLines,String fileName) throws IOException
    {

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        int [] number = new int [numberOfLines];

        for (int i = 0; i < number.length; i++) {
            String s = br.readLine();
            int currentLineNumber = Integer.parseInt(s);
            number[i] = currentLineNumber;
        }
        br.close(); // close buffered reader stream
        fr.close(); // close the file stream
        return number;
    }//readInLines

}//class