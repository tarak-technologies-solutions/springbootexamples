package com.taraktech;

public class Main {
    public static void main(String[] args) {
        int fact = 1,n=4;
        while (n >= 1){
            fact = fact * n;
            n--;
        }
        System.out.println(fact);
    }
}