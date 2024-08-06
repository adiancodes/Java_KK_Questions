package com.questions;

import java.util.Scanner;

//armstrong number using java with the help of functions


public class armstrong {
    static int i = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int n = input.nextInt();

        System.out.println(" ");
        boolean ans;
        for ( i = 100 ; i < 999 ; i++ ){  //this will check for all the three digits armstrong number
            ans = arm(i);
            if (ans) {
                System.out.println(i);
                System.out.println(" ");
            }

        }

    }


    static boolean arm(int n){
        int num = n ;
        int arm = 0 ;
        //int rem = 0;
        while(n>0) {
            int rem = n % 10;
            arm = arm + (rem * rem * rem);
            n=n/10;
        }
        return arm == num;

    }


}
