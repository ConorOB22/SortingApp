package main.sorting;

import java.util.Arrays;

/****
 ***** Created by CONOR O'BOYLE ON 12/03/2024
 ***** UPDATE PROGRAM DESCRIPTION HERE
 ****/
public interface TimedSort extends Sort
{
    default void doTimedSortNano(int[] data) {

        long startTime = 0, endTime = 0, time = 0;
        startTime = System.nanoTime();

        sort(data);

        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("Time = " + time);
    }//doTimedSortNano

}//class