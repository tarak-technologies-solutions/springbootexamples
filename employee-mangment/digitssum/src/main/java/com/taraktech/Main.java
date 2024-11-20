package com.taraktech;

public class Main {
    public static void main(String[] args) {
        int n = 876,rem=0,sum=0;
        while(n>=1){
            rem = n%10;
            sum += rem;
            n/=10;
        }
        System.out.println(sum);
    }
}