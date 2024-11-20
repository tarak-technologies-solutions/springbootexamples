package com.taraktech;

public class Main {
    public static void main(String[] args) {
     int n = 1634,count=0,rem=0,ams=0,temp=n;
     while(n!=0){
         rem = n%10;
         count++;
         n = n/10;
     }
     System.out.println(count);
     n=temp;
     while(n>0){
         rem = n%10;
         ams = (int) Math.pow(rem,count);
         n = n/10;
     }
     if(temp==ams){
         System.out.println("Amstrong");
     }else{
         System.out.println("Not Amstrong");
     }
    }
}