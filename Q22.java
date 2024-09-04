//22.	WAP to find sum of all the factors/divisors of a given number

import java.util.Scanner;

public class Q22 {
    static int sumOfFactors(int x){
        int sum = 0;
        for(int i=1;i<=x;i++){
             if(x%i==0){
                sum = sum +i;
             }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        sc.close();
        int res = sumOfFactors(x);
        System.out.println("Sum of factors of number x is :"+res);
    }
}
