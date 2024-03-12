package main.sorting;

import java.util.Arrays;

/****
 ***** Created by CONOR O'BOYLE ON 12/03/2024
 ***** UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class InsertionSort implements TimedSort
{

    @Override
    public void sort(int[] data)
    {
        for(int i = 1; i < data.length; i++) {
            int temp = data[i];
            int j = i - 1;

            while(j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }

        System.out.println("The sorted array is: "+ Arrays.toString(data));
    }
}//class
