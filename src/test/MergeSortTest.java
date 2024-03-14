package test;

import main.sorting.GetArrays;
import main.sorting.InsertionSort;
import main.sorting.MergeSort;
import org.junit.Test;

import java.util.Random;

/****
 ***** Created by CONOR O'BOYLE ON 12/03/2024
 *****  DESCRIPTION HERE
 ****/
public class MergeSortTest extends GetArrays
{

//
// #################################################################################
// ##############################      SORTED    ###################################
// #################################################################################
//

   @Test
   public void testMergeSortSorted1000Int () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSortNano(getSortedArray(1000));
   }//testMergeSortSorted1000Int

   @Test
   public void testMergeSortSorted10000Int () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSortNano(getSortedArray(10000));
   }//testMergeSortSorted10000Int

   @Test
   public void testMergeSortSorted100000Int () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSortNano(getSortedArray(100000));
   }//testMergeSortSorted100000Int

//
// #################################################################################
// ##############################      RANDOM    ###################################
// #################################################################################
//

   @Test
   public void testMergeSortRandom1000Int_1 () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSortNano(getRandomArray(1000));
   }//testMergeSortRandom1000Int_1

   @Test
   public void testMergeSortRandom1000Int_2 () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSortNano(getRandomArray(1000));
   }//testMergeSortRandom1000Int_2

   @Test
   public void testMergeSortRandom1000Int_3 () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSortNano(getRandomArray(1000));
   }//testMergeSortRandom1000Int_3

   @Test
   public void testMergeSortRandom10000Int_1 () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSortNano(getRandomArray(10000));
   }//testMergeSortRandom10000Int_1

   @Test
   public void testMergeSortRandom10000Int_2 () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSortNano(getRandomArray(10000));
   }//testMergeSortRandom10000Int_2

   @Test
   public void testMergeSortRandom10000Int_3 () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSortNano(getRandomArray(10000));
   }//testMergeSortRandom10000Int_3

   @Test
   public void testMergeSortRandom100000Int_1 () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSortNano(getRandomArray(100000));
   }//testMergeSortRandom100000Int_1

   @Test
   public void testMergeSortRandom100000Int_2 () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSortNano(getRandomArray(100000));
   }//testMergeSortRandom100000Int_2

   @Test
   public void testMergeSortRandom100000Int_3 () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSortNano(getRandomArray(100000));
   }//testMergeSortRandom100000Int_3

//
// #################################################################################
// ##############################    REVERSED    ###################################
// #################################################################################
//

   @Test
   public void testMergeSortReversed1000Int () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSortNano(getReversedArray(1000));
   }//testMergeSortReversed1000Int

   @Test
   public void testMergeSortReversed10000Int () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSortNano(getReversedArray(10000));
   }//testMergeSortReversed10000Int

   @Test
   public void testMergeSortReversed100000Int () {
      MergeSort mergeSort = new MergeSort();
      mergeSort.doTimedSortNano(getReversedArray(100000));
   }//testMergeSortReversed10000Int

}//class