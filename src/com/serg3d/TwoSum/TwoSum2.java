package com.serg3d.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sergey on 10/3/2016.
 */
public class TwoSum2 {

    /*

        Given nums = [2, 7, 11, 15], target = 9,
        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1]

        1. add all numbers of array and indexes into hashMap
        2. find 2 numbers using hashMap API

     */

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = findIndexes(arr, target);

        System.out.println(Arrays.toString(result));
    }

    public static int[] findIndexes(int[] arr, int target){
        Map<Integer, Integer> arrHashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int num = target - arr[i];
            if (arrHashMap.containsKey(num) && arrHashMap.get(num) != i) {
                return new int[] {arrHashMap.get(num), i};
            }
            arrHashMap.put(arr[i], i);
        }
        throw new IllegalArgumentException("Numbers not found");
    }
}
