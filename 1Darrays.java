package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays1 {
    //syntax of an array

    //datatype[] variable_name = new datatype[size]

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of arrays ");
        int n = input.nextInt();  //the size of the array is n we can write this as arr[n]=arr[5] so it will contain 5 elements in it.



        int[] arr1 = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0 ; i< arr1.length ; i++){
            arr1[i] = input.nextInt();
        }

        //for (int i = 0 ; i< arr1.length ; i++){
        //    System.out.print(arr1[i] + " ");
        //}

        //for (int num : arr1){
          //  System.out.print(num + "  "); // num represents the elements of the array
        //}

        //by converting arrays to string we can use arrays . to string metheod;(Arrays.toString(array_name)
        System.out.println(Arrays.toString(arr1)); 
    }


}
