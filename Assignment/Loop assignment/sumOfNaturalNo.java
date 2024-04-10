// Q1. Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.

import java.util.*;
public class sumOfNaturalNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n=");
        int n= sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum= sum+i;
        }
        System.out.println("sum is:" +sum);
    }
}