package com.bridgelabz.problems;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number");
        int x = scan.nextInt();
        System.out.println("Enter Second Number");
        int y = scan.nextInt();
        System.out.println("Enter Third Number");
        int z = scan.nextInt();
        int temp = 0;
        temp = x>y?x:y;
        temp = z>temp?z:temp;
        System.out.println(temp);
    }
}
