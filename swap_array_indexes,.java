package com.arrays;
import java.util.Arrays;
import java.util.Scanner;



public class swaparray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array = ");
        int n = input.nextInt();
        int[] arr = new int[n];

        //taking the array input
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = input.nextInt();
        }


        //displaying the array inputed by the user

        System.out.println(Arrays.toString(arr));

        //swapping the elements


        System.out.println("enter the index do you wanna swap ");
        int s1 = input.nextInt();

        System.out.println("enter the index do you wanna swap with ");
        int s2 = input.nextInt();

        swap(arr,s1,s2);

        //print the swapped array

        System.out.println(Arrays.toString(arr));


    }

    static void swap(int[] arr , int s1, int s2){

        for(int i = 0 ; i < arr.length ; i++){
            if (i==s1){
                int temp = arr[i];
                arr[i] = arr [s2];
                arr[s2] = temp;
                break;
            }

        }
    }
}
