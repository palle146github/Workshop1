package com.bridgelabz.workshop;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        System.out.println("Fibonacci Series upto nth turm is ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = s.nextInt();
        System.out.print(n1 + " " + n2);
        int next = 0;
        for( int i = 2; i < number; i++){
            next = n1 + n2;
            n1 = n2;
            n2 = next;
            System.out.println(" " + next);
        }
    }
}
