package com.searching;

import java.util.Arrays;
import java.util.Scanner;

public class ceiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = input.nextInt();
        System.out.println("Enter the array elements ");
        int [] arr = new int[n];
        for(int i =0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println( " ");
        System.out.println("The Entered array is " + Arrays.toString(arr));

        System.out.println("enter the element to find ceiling for");
        int target = input.nextInt();

        int result = ceil(arr,target);
        System.out.println(result);




    }
// new logic when while looop is voilated just return start as start>end or target
    public static int ceil(int[] nums ,int target ){
        int start = 0 ;
        int end = nums.length - 1 ;
        int index = -1;
        if (end == 1){
            if(nums[0] > target){
                return 0;
            }
            else{
                return 1;
            }
        }
        if (end == 0){
            return 0;
        }
        while (start <= end ){
            int mid = (start + end) / 2 ;
            if (nums[mid] == target){
                index = mid;
                //at this index the element is found
            }
            if (nums[mid] < target){
                start = mid + 1 ;
            }

            else{
                end = mid - 1 ;
            }
        }

        if (index == -1){
            for (int i = 0; i < nums.length; i++) {
                int j = nums[i];
                if (j > target) {
                    return i;
                }
            }
        }
        else{
            return index+1;
        }
        return start;

    }

}
