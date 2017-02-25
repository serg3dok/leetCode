package com.serg3d.KthLargestElementInArray;

import java.util.Arrays;

/**
 * Created by sergeyo on 2/24/2017.
 */
public class KthLargestElementInArray {


        public static void main(String[] args) {
            System.out.println(findKthLargest(new int[] {-1, -1}, 2));
        }


        public static int findKthLargest(int[] nums, int k) {


            int[] arr = new int[nums.length/k];


            for (int i = k-1, j = 0; i < nums.length; i=i+k, j++) {
                arr[j] = nums[i];
            }

            Arrays.sort(arr);

            return(arr[arr.length-1]);

        }
}
