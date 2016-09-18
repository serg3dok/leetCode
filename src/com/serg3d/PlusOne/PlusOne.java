package com.serg3d.PlusOne;

import org.testng.annotations.Test;

/**
 * Created by Sergey on 9/17/2016.
 */
public class PlusOne {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 2};

        arr = plusOne(arr);

        for (int d : arr ) {
            System.out.print(d + " ");
        }

    }

    // 10000+ 3000+ 500+ 70+ 2  = 13572
    // 1 3 5 7 2 -> 13572

    public static int[] plusOne(int[] digits) {

        if (digits.length == 1 && digits[0] < 9){
            digits[0] = digits[0]++;
            return digits;
        }

        int number = digits[digits.length - 1];

        int mult = 10;
        for (int i = digits.length-2; i > -1; i--) {
            number = number + (digits[i] * mult);
            mult = mult * 10;
        }

        number++;

        System.out.println(number);


        int l = 0;


        System.out.println();;


        digits[digits.length-1] = number % 10;
        number = number / 10;

        for (int i = digits.length - 2; i > -1; i++) {
            if (number > 9 && i == 0) {

            }
        }




        int[] resultDigits = new int[2];

        resultDigits[0] = number/10;
        resultDigits[1] = number%10;

        return resultDigits;
    }

}
