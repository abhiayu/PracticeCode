package com.CodeWithAbhi.Arrays_Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 */
public class Array_WithTwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j <= nums.length-1; j++) {
                sum = nums[i] + nums[j];
                if (sum == target ) {
                    return new int[]{i, j};
                }

            }

        }
        return new int[]{-1, -1};

//             Map<Integer,Integer> map=new HashMap<>();
//           int[] result=new int[2];
//           for(int i=0;i<nums.length;i++){
//               if(map.containsKey(target-nums[i])){
//                   result[1]=i;
//                   result[0]=map.get(target-nums[i]);
//                   return result;
//               }
//               map.put(nums[i],i);
//           }
//           return result;
        }


    public static void main(String arg[]) {

        int arr[] = {1, 8, 6, 2, 1, 3};
        int target = 6;
        twoSum(arr, target);
        int[] result = twoSum(arr, target);
        System.out.println(result[0] + ", " + result[1]);

    }
}
