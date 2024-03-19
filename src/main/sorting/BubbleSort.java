package main.sorting;

import java.util.Arrays;

/****
 ***** Created by CONOR O'BOYLE ON 12/03/2024
 ***** UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class BubbleSort implements TimedSort
{
   @Override
   public void sort(int[] data) {
      long countComparisons = 0, countSwaps=0;

      for (int out = data.length -1; out > 0; out--) {
         for (int in = 0; in < out; in++) {
            if (data[in] > data [in+1]) {
               int tmp = data[in]; //swap items
               data[in] = data[in+1];
               data[in+1] = tmp;
               countComparisons++;
               countSwaps++;
            }//if
         }//for
      }//for

      System.out.println("countComparisons: "+ countComparisons);
      System.out.println("countSwaps: "+ countSwaps);
      System.out.println();
   }//bubbleSort
}//class
