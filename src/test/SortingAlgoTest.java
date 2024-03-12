package test;

import main.sorting.BubbleSort;
import main.sorting.InsertionSort;
import main.sorting.MergeSort;
import org.junit.Test;

import java.util.Random;

/****
 ***** Created by CONOR O'BOYLE ON 12/03/2024
 *****  DESCRIPTION HERE
 ****/
public class SortingAlgoTest
{
  //Test Bubble Sort
   @Test
   public void testBubbleSortSorted100Int () {
      BubbleSort bubbleSort = new BubbleSort();
      bubbleSort.doTimedSort(getSortedArray(100));

   }

   @Test
   public void testTimedBubbleSortSorted100Int () {
      BubbleSort bubbleSort = new BubbleSort();
      bubbleSort.doTimedSort(getSortedArray(100));
   }


   @Test
   public void testBubbleSortSorted1000Int () {
      BubbleSort bubbleSort = new BubbleSort();
      bubbleSort.doTimedSort(getSortedArray(1000));

   }

   @Test
   public void testBubbleSortSorted10000Int () {
      BubbleSort bubbleSort = new BubbleSort();
      bubbleSort.doTimedSort(getSortedArray(10000));

   }

   //Test Merge Sort
   @Test
   public void testMergeSortSorted100Int () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSort(getSortedArray(100));

   }

   @Test
   public void testMergeSortSorted1000Int () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSort(getSortedArray(1000));

   }

   @Test
   public void testMergeSortSorted10000Int () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSort(getSortedArray(10000));

   }

   @Test
   public void testBubbleSortRandom100Int () {
      BubbleSort bubbleSort = new BubbleSort();
      bubbleSort.doTimedSort(getRandomArray(100));
   }

   //Test Insertion Sort

   @Test
   public void testInsertionSortSorted100Int () {
      InsertionSort insertionSort = new InsertionSort();
      insertionSort.doTimedSort(getSortedArray(100));

   }

   @Test
   public void testInsertionSortRandom100Int () {
      InsertionSort insertionSort = new InsertionSort();
      insertionSort.doTimedSort(getRandomArray(100));
   }













   private int[] getSortedArray(int length )
   {
      int[] sortedArray = new int[length];

      for (int i = 0; i < sortedArray.length; i++)
      {
         sortedArray[i] = i + 1;
      }
//        System.out.println(Arrays.toString(sortedArray));
      return sortedArray;
   }//getSortedArray

   private int[] getRandomArray(int length ) {
      Random random = new Random();
      int[] randomArray = new int[length];

      for (int i = 0; i < randomArray.length; i++) {
         randomArray[i] = random.nextInt(length + 1);
      }

      return randomArray;
   }


   private int[] getReversedArray(int length) {
      int[] unsortedArray = new int[length];

      for(int i = 0; i < length; i++) {
         unsortedArray[i] = length - i;
      }
      return unsortedArray;
   }//unSortedArray


}//class


