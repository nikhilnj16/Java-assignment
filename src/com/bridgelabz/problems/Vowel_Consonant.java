package com.bridgelabz.problems;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        System.out.println("Enter the alphabet");
        Scanner scan = new Scanner(System.in);
        char x = scan.next().charAt(0);
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
            System.out.println("It's a Vowel");
        }
        else if(x=='A' || x=='E' || x=='I' || x=='O' || x=='U'){
            System.out.println("It's a Vowel");
        }
        else{
            System.out.println("It's a Consonant");
        }
    }
}
