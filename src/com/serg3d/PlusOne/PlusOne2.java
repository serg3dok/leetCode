package com.serg3d.PlusOne;

import java.math.BigInteger;

/**
 * Created by Sergey on 9/17/2016.
 */
public class PlusOne2 {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 2 , 1};
        //int[] arr = {0};

        arr = plusOne(arr);

        for (int d : arr ) {
            System.out.print(d + " ");
        }

    }


    // 1 3 5 7 2 -> 13572
    // 1 3 5 7 2 -> 13572

    public static int[] plusOne(int[] digits) {

        if (digits.length == 1 && digits[0] < 9){
            digits[0] = ++digits[0];
            return digits;
        }

        String numberStr = "";
        for (int i = 0; i < digits.length; i++) {
            numberStr = numberStr + digits[i];
        }

        BigInteger number = BigInteger.valueOf(Long.valueOf(numberStr));

        number.add(BigInteger.ONE);

        System.out.println(number);

        numberStr = String.valueOf(number);

        int[] resultDigits = new int[numberStr.length()];

        for (int i = 0; i < numberStr.length(); i++) {
            //System.out.println(numberStr.charAt(i));
            resultDigits[i] = Integer.parseInt(String.valueOf(numberStr.charAt(i)));
        }

        return resultDigits;
    }

}
