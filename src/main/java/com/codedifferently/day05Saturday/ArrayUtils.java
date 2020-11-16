package com.codedifferently.day05Saturday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int sevens = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToCount) {
                sevens++;
            }
        }
        return sevens;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList approvedNums = new ArrayList(objectArray.length);
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] != objectToRemove) {
                approvedNums.add(objectArray[i]);
            }
        }
        return approvedNums.toArray();
    } //I got this on first run :)

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Integer numCount = 1;
        Integer highestFrequency = 1;
        Integer freqNum = null;
        Integer currentNumber;
        Arrays.sort(objectArray);
        for(int i =1; i < objectArray.length -1; i++) {
            currentNumber = (Integer) objectArray[i];
            Integer nextNumber = (Integer) objectArray[i + 1];

            if (nextNumber.equals(currentNumber)) numCount++;
            else numCount = 1;

            if (numCount > highestFrequency) {
                highestFrequency = numCount;
                freqNum = currentNumber;
            }
        }
        return freqNum;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        return null;
    }
}
