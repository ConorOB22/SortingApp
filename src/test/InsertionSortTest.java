package test;

import main.sorting.BubbleSort;
import main.sorting.GetArrays;
import main.sorting.InsertionSort;
import org.junit.Test;

import java.io.IOException;

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
      for (int i = 0; i < 3; i++)
      {
         insertionSort.doTimedSortNano(getSortedArray(1000));
      }//for
   }//testInsertionSortSorted1000Int

   @Test
   public void testInsertionSortSorted10000Int () {
      InsertionSort insertionSort = new InsertionSort();
      for (int i = 0; i < 3; i++)
      {
         insertionSort.doTimedSortNano(getSortedArray(10000));
      }//for
   }//testInsertionSortSorted10000Int


   @Test
   public void testInsertionSortSorted100000Int () {
      InsertionSort insertionSort = new InsertionSort();
      for (int i = 0; i < 3; i++)
      {
         insertionSort.doTimedSortNano(getSortedArray(100000));
      }//for
   }//testInsertionSortSorted100000Int


//
// #################################################################################
// ##############################      RANDOM    ###################################
// #################################################################################
//

   @Test
   public void testInsertionSortRandom1000Int () throws IOException
   {
      InsertionSort insertionSort = new InsertionSort();
      int[] temp = GetArrays.readFromFile("Average1000.txt", 1000);
      insertionSort.doTimedSortNano(temp);
   }//testInsertionSortRandom1000Int

   @Test
   public void testInsertionSortRandom1000Int_2 () throws IOException
   {
      InsertionSort insertionSort = new InsertionSort();
      int[] temp = GetArrays.readFromFile("Average1000_2.txt", 1000);
      insertionSort.doTimedSortNano(temp);
   }//testInsertionSortRandom10000Int

   @Test
   public void testInsertionSortRandom1000Int_3 () throws IOException
   {
      InsertionSort insertionSort = new InsertionSort();
      int[] temp = GetArrays.readFromFile("Average1000_3.txt", 1000);
      insertionSort.doTimedSortNano(temp);
   }//testInsertionSortRandom10000Int_2

   //// 10,000
   @Test
   public void testInsertionSortRandom10000Int () throws IOException
   {
      InsertionSort insertionSort = new InsertionSort();
      int[] temp = GetArrays.readFromFile("Average10000.txt", 10000);
      insertionSort.doTimedSortNano(temp);
   }//testInsertionSortRandom1000Int

   @Test
   public void testInsertionSortRandom10000Int_2 () throws IOException
   {
      InsertionSort insertionSort = new InsertionSort();
      int[] temp = GetArrays.readFromFile("Average10000_2.txt", 10000);
      insertionSort.doTimedSortNano(temp);
   }//testInsertionSortRandom10000Int

   @Test
   public void testInsertionSortRandom10000Int_3 () throws IOException
   {
      InsertionSort insertionSort = new InsertionSort();
      int[] temp = GetArrays.readFromFile("Average10000_3.txt", 10000);
      insertionSort.doTimedSortNano(temp);
   }//testInsertionSortRandom10000Int_2

   //// 100,000

   @Test
   public void testInsertionSortRandom100000Int () throws IOException
   {
      InsertionSort insertionSort = new InsertionSort();
      int[] temp = GetArrays.readFromFile("Average100000.txt", 100000);
      insertionSort.doTimedSortNano(temp);
   }//testInsertionSortRandom1000Int

   @Test
   public void testInsertionSortRandom100000Int_2 () throws IOException
   {
      InsertionSort insertionSort = new InsertionSort();
      int[] temp = GetArrays.readFromFile("Average100000_2.txt", 100000);
      insertionSort.doTimedSortNano(temp);
   }//testInsertionSortRandom10000Int_2

   @Test
   public void testInsertionSortRandom100000Int_3 () throws IOException
   {
      InsertionSort insertionSort = new InsertionSort();
      int[] temp = GetArrays.readFromFile("Average100000_3.txt", 100000);
      insertionSort.doTimedSortNano(temp);
   }//testInsertionSortRandom10000Int_3


//
// #################################################################################
// ##############################    REVERSED    ###################################
// #################################################################################
//

   @Test
   public void testInsertionSortReversed1000Int () {
      InsertionSort insertionSort = new InsertionSort();
      for (int i = 0; i < 3; i++)
      {
         insertionSort.doTimedSortNano(getReversedArray(1000));
      }//for
   }//testInsertionSortReversed1000Int

   @Test
   public void testInsertionSortReversed10000Int () {
      InsertionSort insertionSort = new InsertionSort();
      for (int i = 0; i < 3; i++)
      {
         insertionSort.doTimedSortNano(getReversedArray(1000));
      }//for
   }//testInsertionSortReversed10000Int

   @Test
   public void testInsertionSortReversed100000Int () {
      InsertionSort insertionSort = new InsertionSort();
      for (int i = 0; i < 3; i++)
      {
         insertionSort.doTimedSortNano(getReversedArray(1000));
      }//for
   }//testInsertionSortReversed100000Int
}//class