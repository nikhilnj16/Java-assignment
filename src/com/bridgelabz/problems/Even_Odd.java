package com.bridgelabz.problems;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        System.out.println("Enter num");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        if (x%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
