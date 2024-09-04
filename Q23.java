//23.	WAP to check a number is perfect or not

import java.util.Scanner;

public class Q23 {

    static boolean isPerfect(int num){
        int sum = 0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if (sum == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number :");
         int x = sc.nextInt();
         sc.close();
         if(isPerfect(x)){
            System.out.println("perfect");
         }
         else{
            System.out.println("Not perfect");
         }
    }
    // static int  perfectNumber(int x){
    //     int sum = 0;
    //     for(int i=1; i<x; i++){
    //         if(x%i==0){
    //             sum = sum +i;
    //         }
    //     }
    //     return sum ;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a number :");
    //     int x = sc.nextInt();
    //     sc.close();
    //     int res = perfectNumber(x);
    //     if(res == x){
    //         System.out.println("The number is a perfect number");
    //     }
    //     else{
    //         System.out.println("The number is not a perfect number");
    //     }
        
    // }
}
