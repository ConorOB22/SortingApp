package main.sorting;

import java.util.Arrays;

/****
 ***** Created by CONOR O'BOYLE ON 12/03/2024
 ***** UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class BubbleSort implements TimedSort
{
   @Override
   public void sort(int[] numbers) {
      long countComparisons = 0, countSwaps=0;

      for (int out = numbers.length -1; out > 0; out--) {
         for (int in = 0; in < out; in++) {
            if (numbers[in] > numbers [in+1]) {
               int tmp = numbers[in]; //swap items
               numbers[in] = numbers[in+1];
               numbers[in+1] = tmp;
               countComparisons++;
               countSwaps++;
            }//if
         }//for
      }//for

      System.out.println("The sorted array is: "+ Arrays.toString(numbers));
      System.out.println("countComparisons: "+ countComparisons);
      System.out.println("countSwaps: "+ countSwaps);

   }//bubbleSort
}//class
