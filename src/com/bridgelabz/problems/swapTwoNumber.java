package com.bridgelabz.problems;

import java.util.Scanner;

public class swapTwoNumber {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to swap");
        Scanner scan = new Scanner(System.in);
        int x,y,temp;
        x = scan.nextInt();
        y = scan.nextInt();
        temp = x;
        x = y;
        y = temp;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}
