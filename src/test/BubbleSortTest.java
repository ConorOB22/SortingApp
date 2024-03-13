package test;

import main.sorting.BubbleSort;
import org.junit.Test;

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
    public void testBubbleSortSorted1000Int () {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doTimedSortNano(getSortedArray(1000));
    }//testBubbleSortSorted1000Int

    @Test
    public void testBubbleSortSorted10000Int () {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doTimedSortNano(getSortedArray(10000));
    }//testBubbleSortSorted10000Int


    @Test
    public void testBubbleSortSorted100000Int () {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doTimedSortNano(getSortedArray(100000));
    }//testBubbleSortSorted100000Int


//
// #################################################################################
// ##############################      RANDOM    ###################################
// #################################################################################
//
    @Test
    public void testBubbleSortRandom1000Int_1 () {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doTimedSortNano(getRandomArray(1000));
    }//testBubbleSortRandom1000Int_1

    @Test
    public void testBubbleSortRandom1000Int_2 () {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doTimedSortNano(getRandomArray(1000));
    }//testBubbleSortRandom1000Int_2

    @Test
    public void testBubbleSortRandom1000Int_3 () {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doTimedSortNano(getRandomArray(1000));
    }//testBubbleSortRandom1000Int_3

    @Test
    public void testBubbleSortRandom10000Int_1 () {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doTimedSortNano(getRandomArray(10000));
    }//testBubbleSortRandom10000Int_1

    @Test
    public void testBubbleSortRandom10000Int_2 () {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doTimedSortNano(getRandomArray(10000));
    }//testBubbleSortRandom10000Int_2

    @Test
    public void testBubbleSortRandom10000Int_3 () {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doTimedSortNano(getRandomArray(10000));
    }//testBubbleSortRandom10000Int_3

    @Test
    public void testBubbleSortRandom100000Int_1 () {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doTimedSortNano(getRandomArray(100000));
    }//testBubbleSortRandom100000Int_1

    @Test
    public void testBubbleSortRandom100000Int_2 () {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doTimedSortNano(getRandomArray(100000));
    }//testBubbleSortRandom100000Int_2

    @Test
    public void testBubbleSortRandom100000Int_3 () {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doTimedSortNano(getRandomArray(100000));
    }//testBubbleSortRandom100000Int_3


//
// #################################################################################
// ##############################    REVERSED    ###################################
// #################################################################################
//

    @Test
    public void testBubbleSortReversed1000Int () {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doTimedSortNano(getReversedArray(1000));
    }//testBubbleSortReversed1000Int

    @Test
    public void testBubbleSortReversed10000Int () {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doTimedSortNano(getReversedArray(10000));
    }//testBubbleSortReversed10000Int

    @Test
    public void testBubbleSortReversed100000Int () {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doTimedSortNano(getReversedArray(100000));
    }//testBubbleSortReversed100000Int

}//class
