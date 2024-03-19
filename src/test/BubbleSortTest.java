package test;

import main.sorting.BubbleSort;

import main.sorting.GetArrays;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

import static test.MergeSortTest.*;

/****
 ***** Created by CONOR O'BOYLE ON 12/03/2024
 ***** UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class BubbleSortTest
{
//
// #################################################################################
// ##############################      SORTED    ###################################
// #################################################################################
//
    @Test
    public void testBubbleSortSorted1000Int () throws IOException
    {
        BubbleSort bubbleSort = new BubbleSort();
        for (int i = 0; i < 3; i++)
        {
            bubbleSort.doTimedSortNano(getSortedArray(1000));
        }//for

    }//testBubbleSortSorted1000Int

    @Test
    public void testBubbleSortSorted10000Int () {
        BubbleSort bubbleSort = new BubbleSort();
        for (int i = 0; i < 3; i++)
        {
            bubbleSort.doTimedSortNano(getSortedArray(10000));
        }//for
    }//testBubbleSortSorted10000Int


    @Test
    public void testBubbleSortSorted100000Int () {
        BubbleSort bubbleSort = new BubbleSort();
        for (int i = 0; i < 3; i++)
        {
            bubbleSort.doTimedSortNano(getSortedArray(100000));
        }//for
    }//testBubbleSortSorted100000Int

////
//// #################################################################################
//// ##############################      RANDOM    ###################################
//// #################################################################################
////
//
    @Test
    public void testBubbleSortRandom1000Int () throws IOException
    {
        BubbleSort bubbleSort = new BubbleSort();
        int[] temp = GetArrays.readFromFile("Average1000.txt", 1000);
        bubbleSort.doTimedSortNano(temp);
    }//testBubbleSortRandom1000Int

    @Test
    public void testBubbleSortRandom1000Int_2 () throws IOException
    {
        BubbleSort bubbleSort = new BubbleSort();
        int[] temp = GetArrays.readFromFile("Average1000_2.txt", 1000);
        bubbleSort.doTimedSortNano(temp);
    }//testBubbleSortRandom10000Int

    @Test
    public void testBubbleSortRandom1000Int_3 () throws IOException
    {
        BubbleSort bubbleSort = new BubbleSort();
        int[] temp = GetArrays.readFromFile("Average1000_3.txt", 1000);
        bubbleSort.doTimedSortNano(temp);
    }//testBubbleSortRandom10000Int_2

    //// 10,000
    @Test
    public void testBubbleSortRandom10000Int () throws IOException
    {
        BubbleSort bubbleSort = new BubbleSort();
        int[] temp = GetArrays.readFromFile("Average10000.txt", 10000);
        bubbleSort.doTimedSortNano(temp);
    }//testBubbleSortRandom1000Int


    @Test
    public void testBubbleSortRandom10000Int_2 () throws IOException
    {
        BubbleSort bubbleSort = new BubbleSort();
        int[] temp = GetArrays.readFromFile("Average10000_2.txt", 10000);
        bubbleSort.doTimedSortNano(temp);
    }//testBubbleSortRandom10000Int

    @Test
    public void testBubbleSortRandom10000Int_3 () throws IOException
    {
        BubbleSort bubbleSort = new BubbleSort();
        int[] temp = GetArrays.readFromFile("Average10000_3.txt", 10000);
        bubbleSort.doTimedSortNano(temp);
    }//testBubbleSortRandom10000Int_2

    //// 100,000

    @Test
    public void testBubbleSortRandom100000Int () throws IOException
    {
        BubbleSort bubbleSort = new BubbleSort();
        int[] temp = GetArrays.readFromFile("Average100000.txt", 100000);
        bubbleSort.doTimedSortNano(temp);
    }//testBubbleSortRandom1000Int

    @Test
    public void testBubbleSortRandom100000Int_2 () throws IOException
    {
        BubbleSort bubbleSort = new BubbleSort();
        int[] temp = GetArrays.readFromFile("Average100000_2.txt", 100000);
        bubbleSort.doTimedSortNano(temp);
    }//testBubbleSortRandom10000Int_2

    @Test
    public void testBubbleSortRandom100000Int_3 () throws IOException
    {
        BubbleSort bubbleSort = new BubbleSort();
        int[] temp = GetArrays.readFromFile("Average100000_3.txt", 100000);
        bubbleSort.doTimedSortNano(temp);
    }//testBubbleSortRandom10000Int_3


//
// #################################################################################
// ##############################    REVERSED    ###################################
// #################################################################################
//

    @Test
    public void testBubbleSortReversed1000Int () {
        BubbleSort bubbleSort = new BubbleSort();
        for (int i = 0; i < 3; i++)
        {
            bubbleSort.doTimedSortNano(getReversedArray(1000));
        }//for
    }//testBubbleSortReversed1000Int

    @Test
    public void testBubbleSortReversed10000Int () {
        BubbleSort bubbleSort = new BubbleSort();
        for (int i = 0; i < 3; i++)
        {
            bubbleSort.doTimedSortNano(getReversedArray(10000));
        }//for
    }//testBubbleSortReversed10000Int

    @Test
    public void testBubbleSortReversed100000Int () {
        BubbleSort bubbleSort = new BubbleSort();
        for (int i = 0; i < 3; i++)
        {
            bubbleSort.doTimedSortNano(getReversedArray(100000));
        }
    }//testBubbleSortReversed100000Int

}//class