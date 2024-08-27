package com.questions;

public class infinite_array {
    public static void main(String[] args) {
        int[] array = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(array,target));

    }

    static int ans(int[] array , int target){
        int start = 0 ;
        int end = 1;
        while (target > array[end]){
            int temp = end +1  ;
            end = end + (end - start +1)*2;
            start = temp ;


        }
        return search(array, target , start ,end);

    }

    static int search(int[] array , int target , int start , int end){
        while(start <= end ){
            int mid = start + (end - start)/2 ;
            if(target < array[mid]){
                end = mid - 1 ;

            }
            else if (target > array[mid]){
                start = mid +1 ;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
