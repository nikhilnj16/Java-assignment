package com.bridgelabz.problems;
import java.util.Scanner;
public class powerof2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp;
        double a;
        a=Math.pow(2,num);
        for(int i = 1; i <= num; i++)
        {
            temp=(int)Math.pow(2,i);
            if(temp<=a)
            {
                System.out.println(temp);
            }
        }

    }
}
