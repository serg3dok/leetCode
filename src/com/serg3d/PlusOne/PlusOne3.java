package com.serg3d.PlusOne;

import java.math.BigInteger;
import java.util.Timer;


/**
 * Created by Sergey on 9/17/2016.
 */
public class PlusOne3 {

    public static void main(String[] args) {

        //int[] arr = {9, 3, 5, 7, 2 , 1};
        //int[] arr = {9, 9, 9, 9, 9 , 9};
        int[] arr = {9, 8};
        //int[] arr = {0};

        arr = plusOne(arr);

        for (int d : arr ) {
            System.out.print(d + " ");
        }

    }


    // Solve this problem by
    // converting Array to String
    // and convert char by char into digit, increment it
    // and convert back to String
    // convert string to array

    public static int[] plusOne(int[] digits) {


        int last = digits.length - 1;

        // check if  last element less than 9, if so add 1 and return array
        if (digits[last] < 9){
            digits[last] = digits[last] + 1;
            return digits;
        }



        //declare variable increment
        int increment = 0;
        for (int i = last; i > -1; i--) {
            if (i == last) {
                digits[i] = digits[i] + 1;
            }
            
            digits[i] = digits[i] + increment;
            increment = 0;
            if (digits[i] > 9) {
                increment++;
                digits[i] = digits[i] % 10;
            }
        }

            if (increment > 0) {
                int[] moreDigits = new int[digits.length + 1];
                moreDigits[0] = increment;
                for (int j = 1; j < moreDigits.length; j++) {
                    moreDigits[j] = digits[j-1];
                }
                return moreDigits;
            }

        return digits;
    }

}
