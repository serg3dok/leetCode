package com.serg3d.TwoSum;

/**
 * Created by Sergey on 9/11/2016.
 */

/*



 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        twoSum(nums, target);
        System.out.println(nums[0] + " " + nums[1]);


    }

    //        i
    // 2 7 11 15
    //            j
    // - 7 11 15

    // target = 9
    //


    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] +  nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }
}
