package com.bridgelabz.problems;

import java.util.Scanner;

public class Quotient_Remainder {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scan = new Scanner(System.in);
        int x,y;
        x = scan.nextInt();
        y = scan.nextInt();
        System.out.println("Quotient: " + x/y);
        System.out.println("Remainder: " + x%y);
    }
}
