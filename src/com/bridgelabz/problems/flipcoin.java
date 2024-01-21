package com.bridgelabz.problems;
import java.util.Scanner;
public class flipcoin {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of flips");

        int num = scan.nextInt();
        int tail=0;
        int head=0;
        for(int i = 0; i < num; i++){
            double randomValue = Math.random();
            if (randomValue < 0.5){
                tail+=1;
            }
            else {
                head+=1;
            }
        }
        double per_tail = (double) (100 * tail) / num;
        double per_head = (double) (100 * head) /num;
        System.out.println("percentage of tails");
        System.out.println(per_tail);
        System.out.println("percentage of heads");
        System.out.println(per_head);
    }
}
