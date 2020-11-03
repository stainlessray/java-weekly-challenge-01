package com.codedifferently.day01Tuesday;

public class BasicArrayUtils {
    /**

     * @return the first element in the array
     */
    public static String getFirstElement(String[] inputArray) {

        return inputArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {

        return stringArray[1];
    }

    /**
     * @param input an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static StringBuilder reverse(String[] input) {
        return new StringBuilder(input).reverse().toString();
        //return null;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        return null;
    }
}
