package com.arrays;
import java.util.Scanner;

public class mininarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for ( int j = 0 ; j < arr.length ; j++){
            arr[j]=input.nextInt();
        }
        int i = 0;
        int min = arr[i];
        for ( i = 0 ; i < arr.length ; i++){
            if(arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.println("the minimum in the array is");
        System.out.println(min);
    }
}
