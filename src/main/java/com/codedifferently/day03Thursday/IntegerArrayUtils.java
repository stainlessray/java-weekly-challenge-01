package com.codedifferently.day03Thursday;

import java.util.Arrays;
import java.util.Collections;

public class IntegerArrayUtils {
    /**
     * @param input an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] input) {
        Integer myTotal = 0;
        for (int i = 0; i != input.length; i ++) {
            myTotal += input[i];
        }
        return myTotal;
    }

    /**
     * @param input an array of integers
     * @return the product of `intArray`
     */
    public static int getProduct(Integer[] input) {
        int myTotal = 1;
            for (int i = 1; i <= input.length-1; i++) {
                myTotal = myTotal*(input[i]);
            }
        System.out.println(myTotal);
        return myTotal;
    }


    /**
     * @param input an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] input) {
        Integer numbers = getSum(input);
        int myAvg = (numbers/input.length);
        double d = myAvg;
        return d;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        return Collections.max(Arrays.asList(intArray));
    }
}
