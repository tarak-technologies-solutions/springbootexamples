package com.taraktech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int f1 =0,f2=0,sum=1;
        System.out.print(f2+" ");
        while(sum <= n){
            System.out.print(sum+" ");
            f1= f2;
            f2= sum;
            sum= f1+f2;
        }
    }
}