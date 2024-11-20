package com.taraktech;

public class Main {
    public static void main(String[] args) {
        int n =879,rem=0,rev=0,sum=0;
        while(n>=1){
            rem = n%10;
            rev = rev *10 + rem;
            n = n/10;
        }
        System.out.println("Sum: "+rev);
    }
}