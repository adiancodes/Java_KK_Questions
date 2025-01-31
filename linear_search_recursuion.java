package com.recursion;

import java.util.ArrayList;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = { 10 ,20 ,7 , 30 ,1 ,7, 8 ,9 ,90};
        int target = 90 ;
        boolean result = linear(arr,target , 0);
        System.out.println(result);
        int indexreturn = linearindex(arr , 5 ,0);
        System.out.println(linearindex(arr , 90 ,0));
        linearallindex(arr , 7 , 0 );
        System.out.println(list);

    }
    public static boolean linear(int[] arr , int target , int index) {
        if (index == arr.length  ){
            return false ;
        }

        return ((arr[index] == target) || linear(arr , target , index+1 ));

    }

    public static int linearindex (int[] arr , int target , int index ) {
        if(index == arr.length  ){
            return -1 ;
        }

        if(arr[index] == target){
            return index ;
        }
        else{
            return linearindex(arr , target , index+1);
        }

    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static void linearallindex (int[] arr , int target , int index ) {
        if(index == arr.length  ){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }
        linearallindex(arr , target , index+1);


    }
}
