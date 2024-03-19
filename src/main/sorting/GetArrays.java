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
    public static int[] average1000 = new int[1000];
    public static int[] average1000_2 = new int[1000];
    public static int[] average1000_3 = new int[1000];
    public static int[] average10000 = new int[10000];
    public static int[] average10000_2 = new int[10000];
    public static int[] average10000_3 = new int[10000];
    public static int[] average100000 = new int[100000];
    public static int[] average100000_2 = new int[100000];
    public static int[] average100000_3 = new int[100000];
    public static void arrayFromFile () throws IOException {

    average1000 = readFromFile("Average1000.txt", 1000);
    average1000_2 = readFromFile("Average1000_2.txt", 1000);
    average1000_3 = readFromFile("Average1000_3.txt", 1000);
    average10000 = readFromFile("Average10000.txt", 10000);
    average10000_2 = readFromFile("Average10000_2.txt", 10000);
    average10000_3 = readFromFile("Average10000_3.txt", 10000);
    average100000 = readFromFile("Average100000.txt", 100000);
    average100000_2 = readFromFile("Average100000_2.txt", 100000);
    average100000_3 = readFromFile("Average100000_23.txt", 100000);

//    readFromFile("Average1000.txt", average1000);
//    readFromFile("Average1000_2.txt", average1000_2);
//    readFromFile("Average1000_3.txt", average1000_3);
//
//    readFromFile("Average10000.txt", average10000);
//    readFromFile("Average10000_2.txt", average10000_2);
//    readFromFile("Average10000_3.txt", average10000_3);
//
//    readFromFile("Average100000.txt", average100000);
//    readFromFile("Average100000_2.txt", average100000_2);
//    readFromFile("Average100000_3.txt", average100000_3);
    }


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

    public static int[] getReversedArray(int length) {
        int[] reversedArray = new int[length];

        for(int i = 0; i < length; i++) {
            reversedArray[i] = length - i;
        }
        return reversedArray;
    }//getReversedArray

    public static int[] readFromFile(String name, int size) throws IOException {          //method to read from file and create an array
        int[] a = new int [size];
        FileReader fr = new FileReader(name);
        BufferedReader br = new BufferedReader(fr);
        String c = br.readLine();
        int i = 0;
        while(c!=null){
            a[i] = Integer.parseInt(c);
            c = br.readLine();
            i++;
        }
        br.close(); fr.close();
        return a;
    }//readFromFile

}//class