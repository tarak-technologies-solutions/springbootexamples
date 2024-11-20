package com.taraktech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int rev=0,rem=0,temp=num;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==temp){
            System.out.println("Palindrome Number");
        }else {
            System.out.println("Not a Palindrome Number");
        }
    }
}