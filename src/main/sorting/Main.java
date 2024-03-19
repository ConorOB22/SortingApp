package main.sorting;

import main.sorting.GetArrays;
import main.sorting.GetFiles;

import java.io.IOException;
import java.util.Arrays;

/****
 ***** Created by CONOR O'BOYLE ON 12/03/2024
 ***** UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class Main extends GetArrays
{
    public static void main(String[] args) throws IOException
    {
//        GetFiles.createFiles();
        GetArrays.arrayFromFile();
        System.out.println(Arrays.toString(average1000));
    }
}