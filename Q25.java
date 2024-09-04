//25.	WAP to check if a number is prime or not

import java.util.Scanner;

public class Q25 {

     static  boolean primeNumber(int x){
         int count = 0;
        for(int i=2; i<x; i++){
            if(x%i==0){
                count++;
            }
        }
        if (count>0) {
           return false;
        }
       return true;
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        sc.close();
        if(primeNumber(x)){
            System.out.println("Number is prime");
        }
        else 
        {
            System.out.println("Number is not prime");
        }
     }
    // static void primeNumber(int x)
    // {
    //     int count = 0;
    //     for(int i=2; i<x; i++){
    //         if(x%i==0){
    //             count++;
    //         }
    //     }
    //     if (count>0) {
    //         System.out.println("It is not a prime number ");
    //     }
    //     else{
    //         System.out.println("It is a prime number ");
    //     }
    // }
    //   public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a number :");
    //     int x = sc.nextInt();
    //     sc.close();
    //     primeNumber(x);
    // }

   
}
