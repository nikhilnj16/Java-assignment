package com.bridgelabz.problems;

import java.util.Scanner;

public class nthHarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int harValue=0;
        for (int i=1; i<=n; i++) {
            harValue+=1/i;
        }
        System.out.println("Harmonic Value : " + harValue);
    }
}
