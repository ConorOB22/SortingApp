package main;

import main.sorting.GetArrays;

import java.io.IOException;

/****
 ***** Created by CONOR O'BOYLE ON 12/03/2024
 ***** UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class Main extends GetArrays
{
    public static void main(String[] args) throws IOException
    {
        GetArrays.printArray(GetArrays.getRandomArray(1000),"Random Array-1000.txt");
        GetArrays.printArray(GetArrays.getRandomArray(10000),"Random Array-10000.txt");
        GetArrays.printArray(GetArrays.getRandomArray(100000),"Random Array-100000.txt");
    }
}