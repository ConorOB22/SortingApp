package test;

import main.sorting.BubbleSort;
import main.sorting.InsertionSort;
import org.junit.Test;

import static test.MergeSortTest.*;
import static test.MergeSortTest.getReversedArray;

/****
 ***** Created by CONOR O'BOYLE ON 12/03/2024
 ***** UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class InsertionSortTest
{

//
// #################################################################################
// ##############################      SORTED    ###################################
// #################################################################################
//
   @Test
   public void testInsertionSortSorted1000Int () {
      InsertionSort insertionSort = new InsertionSort();
      insertionSort.doTimedSortNano(getSortedArray(1000));
   }//testInsertionSortSorted1000Int

   @Test
   public void testInsertionSortSorted10000Int () {
      InsertionSort insertionSort = new InsertionSort();
      insertionSort.doTimedSortNano(getSortedArray(10000));
   }//testInsertionSortSorted10000Int


   @Test
   public void testInsertionSortSorted100000Int () {
      InsertionSort insertionSort = new InsertionSort();
      insertionSort.doTimedSortNano(getSortedArray(100000));
   }//testInsertionSortSorted100000Int


//
// #################################################################################
// ##############################      RANDOM    ###################################
// #################################################################################
//

   @Test
   public void testInsertionSortRandom1000Int () {
      InsertionSort insertionSort = new InsertionSort();
      insertionSort.doManySorts(3,getRandomArray(1000));
   }//testInsertionSortRandom1000Int_1

//   @Test
//   public void testInsertionSortRandom1000Int_2 () {
//      InsertionSort insertionSort = new InsertionSort();
//      insertionSort.doTimedSortNano(getRandomArray(1000));;
//   }//testInsertionSortRandom1000Int_2
//
//   @Test
//   public void testInsertionSortRandom1000Int_3 () {
//      InsertionSort insertionSort = new InsertionSort();
//      insertionSort.doTimedSortNano(getRandomArray(1000));
//   }//testInsertionSortRandom1000Int_3

   @Test
   public void testInsertionSortRandom10000Int () {
      InsertionSort insertionSort = new InsertionSort();
      insertionSort.doManySorts(3,getRandomArray(10000));
   }//testInsertionSortRandom10000Int_1

//   @Test
//   public void testInsertionSortRandom10000Int_2 () {
//      InsertionSort insertionSort = new InsertionSort();
//      insertionSort.doTimedSortNano(getRandomArray(10000));
//   }//testInsertionSortRandom10000Int_2
//
//   @Test
//   public void testInsertionSortRandom10000Int_3 () {
//      InsertionSort insertionSort = new InsertionSort();
//      insertionSort.doTimedSortNano(getRandomArray(10000));
//   }//testInsertionSortRandom10000Int_3

   @Test
   public void testInsertionSortRandom100000Int () {
      InsertionSort insertionSort = new InsertionSort();
      insertionSort.doManySorts(3,getRandomArray(100000));
   }//testInsertionSortRandom100000Int_1

//   @Test
//   public void testInsertionSortRandom100000Int_2 () {
//      InsertionSort insertionSort = new InsertionSort();
//      insertionSort.doTimedSortNano(getRandomArray(100000));
//   }//testInsertionSortRandom100000Int_2
//
//   @Test
//   public void testInsertionSortRandom100000Int_3 () {
//      InsertionSort insertionSort = new InsertionSort();
//      insertionSort.doTimedSortNano(getRandomArray(100000));
//   }//testInsertionSortRandom100000Int_3


//
// #################################################################################
// ##############################    REVERSED    ###################################
// #################################################################################
//

   @Test
   public void testInsertionSortReversed1000Int () {
      InsertionSort insertionSort = new InsertionSort();
      insertionSort.doTimedSortNano(getReversedArray(1000));
   }//testInsertionSortReversed1000Int

   @Test
   public void testInsertionSortReversed10000Int () {
      InsertionSort insertionSort = new InsertionSort();
      insertionSort.doTimedSortNano(getReversedArray(1000));
   }//testInsertionSortReversed10000Int

   @Test
   public void testInsertionSortReversed100000Int () {
      InsertionSort insertionSort = new InsertionSort();
      insertionSort.doTimedSortNano(getReversedArray(1000));
   }//testInsertionSortReversed100000Int

}//class