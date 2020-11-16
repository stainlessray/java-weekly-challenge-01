package com.codedifferently.day02Wednesday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String[] strArray = str.split(" ");
        String camelWord;
        String camelWords = "";
        for (String s : strArray) {
            camelWord = s.substring(0, 1).toUpperCase() + s.substring(1);
            camelWords = camelWords += camelWord + " ";
        }
        return camelWords.stripTrailing();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String[] stringArray = str.split("");
        String output = "";
        int counter = 0;
        for (int i = stringArray.length -1; i >= 0; i--) {
            //reverseString[counter] = stringArray[i];
            output += stringArray[i];
            counter++;
        }
        return output;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        //String[] stringArray = str.split(" ");
        //ArrayList<String> words = new ArrayList<>();
        //String word = "";
        //StringBuilder result = new StringBuilder();

        List newList = new ArrayList<String>();
        newList = Arrays.asList(str);
        //StringBuilder input = new StringBuilder();
        String concatString = "";
        for (int i = 3; i != -1; i-- ) {
            String result = (String) newList.get(i);

            System.out.println(result);
            /*System.out.println(result);
*/
        }
        return "hello";
    }
      /*  for (String word: stringArray) {
            stringArray = word.split("");
            for (int i = word.split("").length; i >= 0; i--)

                System.out.println(i + word);


        }*/



       /* word += stringArray[i];
        words.add(stringArray[i]);*/



   /*
    }
        String[] stringArray = str.split(" ");
        StringBuilder input = new StringBuilder();
        input.append(str+" ");
        System.out.println(input.toString());
        input = input.reverse();
        System.out.println(input1.toString());
*/






    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return null;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        //invertCasing()
        return null;
    }
}
