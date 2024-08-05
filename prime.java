package com.functions;

//this is the program to check if a number is prime or not using functions in java.



import java.util.Scanner;

public class swap{

//main function starts here.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   //to take an input from the user
        System.out.println("Enter a number to check");
        int n = input.nextInt();

        int pri = prime(n); //calling my prime function

        

        if (pri == 0){
            System.out.println("this is a prime number");  //if the valur of count = 0 then the number is prime 
        }
        else{
            System.out.println("this is not a prime number");
        }

    }




    //function for prime number

    static int prime(int a){
        int count = 0 ;
        for (int i =2 ; i <a ; i++  ){
            if ( a% 2 == 0 ){
                count = count + 1 ;

            }

        }
        return count;
    }
}




