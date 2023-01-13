package com.bridgelabz.workshop;

import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to print its reverse");
        int number = s.nextInt();
        int temp = 0;
        int reverse = 0;
        while( number > 0){
            temp = number % 10;
            reverse = reverse * 10 + temp;
            number /= 10;
        }
        System.out.println(reverse);

    }
}
