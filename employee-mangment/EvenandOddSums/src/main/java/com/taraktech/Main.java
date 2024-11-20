package com.taraktech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int evenSum =0,oddSum =0,i=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        while (i <= n){
            if(i%2==0){
                evenSum += i;
            }else {
                oddSum = oddSum + i;
            }
            i++;
        }
        System.out.println("The sum of even numbers is : "+evenSum);
        System.out.println("The sum of odd numbers is : "+oddSum);
    }
}