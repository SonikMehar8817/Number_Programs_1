//32.	WAP to swap two numbers without using third variable

import java.util.Scanner;

public class Q32 {
    static void swapNumbers(int a,int b){
        
        System.out.println("Before swapping the value of a is :"+a);
        System.out.println("Before swapping the value of b is :"+b);
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swapping the value of a is :"+a);
        System.out.println("After swapping the value of b is :"+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        sc.close();
        swapNumbers(a,b);
    }
}
