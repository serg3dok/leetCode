package com.serg3d.ShortestWordDistance;

/**
 * Created by Sergey on 11/20/2016.
 */
public class Solution {

    public static void main(String[] args) {
        String word1 = "a";
        String word2 = "b";
        String[] words = { "a", "a", "b", "b"};
        System.out.println(shortestDistance(words, word1, word2));

    }

    public static int shortestDistance(String[] words, String word1, String word2) {

        int counter1 = Integer.MAX_VALUE;
        int counter2 = Integer.MAX_VALUE;
        int shortest = Integer.MAX_VALUE;
        int i = 0;

        //if word1 is first
        while (i < words.length-1) {
            if (words[i].equals(word1)) {
                counter1 = 0;
                while (!words[i].equals(word2) && i < words.length) {

                    i++;
                    if (words[i].equals(word1)) {
                        counter1 = 0;
                        continue;
                    }
                    counter1++;
                 }
                if (shortest > counter1) {
                    shortest = counter1;
                    counter1 = shortest;
                    continue;
                }
            }

            // if word2 is first
            else if (words[i].equals(word2)) {
                counter2 = 0;
                while (!words[i].equals(word1) && i < words.length) {
                    i++;                    if (word2.equals(words[i])) {
                        counter2 = 0;
                        continue;
                    }

                    counter2++;
                }
                if (shortest > counter2) {
                    shortest = counter2;
                    counter2 = shortest;
                    continue;
                }
            }

            i++;
        }







        /*
        for (int i = 0; i < words.length; i++) {
            //System.out.println(i);
            //System.out.println(words[i]);
            if (words[i] == word1) { // a
                System.out.println(words[i]);
                while(words[i] != (word2)) {

                    i++;
                    counter1++;
                    System.out.println(counter1);
                }

                if (shortest > counter1) {
                    shortest = counter1;
                    System.out.println(counter1);
                    counter1 = 0;
                }
            }

            if (words[i] == word2) {

                while(words[i] != word1) {
                    i++;
                    counter2++;
                }

                if (shortest > counter2) {
                    shortest = counter2;
                    counter2 = 0;
                }
            }

        }
        */

        return shortest;
    }
}
