package com.serg3d.PlusOne;

import java.math.BigInteger;

/**
 * Created by Sergey on 9/17/2016.
 */
public class PlusOne3 {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 2 , 1};
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

        if (digits.length == 1 && digits[0] < 9){
            digits[0] = ++digits[0];
            return digits;
        }

        int increment = 0;
        for (int i = digits.length - 1; i > -1; i--) {
            if (i == digits.length) {
                digits[i] = (++digits[i]);
            }
            digits[i] = digits[i] + increment;
            increment = 0;
            if (digits[i] > 9) {
                increment++;
                digits[i] = digits[i] % 10;
                System.out.println(digits[i]);
            }

        }



        return digits;
    }

}
