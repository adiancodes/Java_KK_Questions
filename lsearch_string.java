package com.searching;
import java.util.Arrays;
import java.util.Scanner;


public class searching_in_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = input.nextLine();
        System.out.println("Enter the character you wanna search");
        char target = input.next().charAt(0);
        System.out.println(" ");
        boolean ans = search(name,target);
        if(ans){
            System.out.println("character found");
        }
        else{
            System.out.println("Character not found");
        }


    }

//    static boolean search(String name, char target){
//        if(name.isEmpty()){
//            return false;
//        }
//        for ( int i =0 ; i < name.length() ; i++){
//            if ( target == name.charAt(i)){
//                return true;
//            }
//
//        }
//        return false;
//
//    }



    //using for each loop and converting string to character array


    static boolean search(String name, char target){
        if(name.isEmpty()){
            return false;
        }
        for ( char c : name.toCharArray()){
            if ( c == target ){
                return true;
            }
        }
        return false;

    }




}
