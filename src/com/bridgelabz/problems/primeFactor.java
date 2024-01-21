package com.bridgelabz.problems;

import java.util.Scanner;

public class primeFactor {
    public static int is_prime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return 0;
            }
        }
        return 1;

    }


    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i=2; i<=num; i++){
            if (is_prime(i) == 1 && num%i == 0){
                System.out.println(i);
            }
        }
    }
}
