package test;

import main.sorting.BubbleSort;
import main.sorting.GetArrays;
import main.sorting.InsertionSort;
import main.sorting.MergeSort;
import org.junit.Test;

import java.io.IOException;
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
      for (int i = 0; i < 3; i++)
      {
         mergeSort.doTimedSortNano(getSortedArray(1000));
      }//for
   }//testMergeSortSorted1000Int

   @Test
   public void testMergeSortSorted10000Int () {
      MergeSort mergeSort = new MergeSort();
      for (int i = 0; i < 3; i++)
      {
         mergeSort.doTimedSortNano(getSortedArray(10000));
      }//for
   }//testMergeSortSorted10000Int

   @Test
   public void testMergeSortSorted100000Int () {
      MergeSort mergeSort = new MergeSort();
      for (int i = 0; i < 3; i++)
      {
         mergeSort.doTimedSortNano(getSortedArray(100000));
      }//for
   }//testMergeSortSorted100000Int

//
// #################################################################################
// ##############################      RANDOM    ###################################
// #################################################################################
//

   @Test
   public void testMergeSortRandom1000Int () throws IOException
   {
      MergeSort mergeSort = new MergeSort();
      int[] temp = GetArrays.readFromFile("Average1000.txt", 1000);
      mergeSort.doTimedSortNano(temp);
   }//testMergeSortRandom1000Int

   @Test
   public void testMergeSortRandom1000Int_2 () throws IOException
   {
      MergeSort mergeSort = new MergeSort();
      int[] temp = GetArrays.readFromFile("Average1000_2.txt", 1000);
      mergeSort.doTimedSortNano(temp);
   }//testMergeSortRandom10000Int

   @Test
   public void testMergeSortRandom1000Int_3 () throws IOException
   {
      MergeSort mergeSort = new MergeSort();
      int[] temp = GetArrays.readFromFile("Average1000_3.txt", 1000);
      mergeSort.doTimedSortNano(temp);
   }//testMergeSortRandom10000Int_2

   //// 10,000
   @Test
   public void testMergeSortRandom10000Int () throws IOException
   {
      MergeSort mergeSort = new MergeSort();
      int[] temp = GetArrays.readFromFile("Average10000.txt", 10000);
      mergeSort.doTimedSortNano(temp);
   }//testMergeSortRandom1000Int


   @Test
   public void testMergeSortRandom10000Int_2 () throws IOException
   {
      MergeSort mergeSort = new MergeSort();
      int[] temp = GetArrays.readFromFile("Average10000_2.txt", 10000);
      mergeSort.doTimedSortNano(temp);
   }//testMergeSortRandom10000Int

   @Test
   public void testMergeSortRandom10000Int_3 () throws IOException
   {
      MergeSort mergeSort = new MergeSort();
      int[] temp = GetArrays.readFromFile("Average10000_3.txt", 10000);
      mergeSort.doTimedSortNano(temp);
   }//testMergeSortRandom10000Int_2

   //// 100,000

   @Test
   public void testMergeSortRandom100000Int () throws IOException
   {
      MergeSort mergeSort = new MergeSort();
      int[] temp = GetArrays.readFromFile("Average100000.txt", 100000);
      mergeSort.doTimedSortNano(temp);
   }//testMergeSortRandom1000Int

   @Test
   public void testMergeSortRandom100000Int_2 () throws IOException
   {
      MergeSort mergeSort = new MergeSort();
      int[] temp = GetArrays.readFromFile("Average100000_2.txt", 100000);
      mergeSort.doTimedSortNano(temp);
   }//testMergeSortRandom10000Int_2

   @Test
   public void testMergeSortRandom100000Int_3 () throws IOException
   {
      MergeSort mergeSort = new MergeSort();
      int[] temp = GetArrays.readFromFile("Average100000_3.txt", 100000);
      mergeSort.doTimedSortNano(temp);
   }//testMergeSortRandom10000Int_3

//
// #################################################################################
// ##############################    REVERSED    ###################################
// #################################################################################
//

   @Test
   public void testMergeSortReversed1000Int () {
      MergeSort mergeSort = new MergeSort();
      for (int i = 0; i < 3; i++)
      {
         mergeSort.doTimedSortNano(getReversedArray(1000));
      }//for
   }//testMergeSortReversed1000Int

   @Test
   public void testMergeSortReversed10000Int () {
      MergeSort mergeSort = new MergeSort();
      for (int i = 0; i < 3; i++)
      {
         mergeSort.doTimedSortNano(getReversedArray(10000));
      }//for
   }//testMergeSortReversed10000Int

   @Test
   public void testMergeSortReversed100000Int () {
      MergeSort mergeSort = new MergeSort();
      for (int i = 0; i < 3; i++)
      {
         mergeSort.doTimedSortNano(getReversedArray(100000));
      }//for
   }//testMergeSortReversed10000Int

}//class