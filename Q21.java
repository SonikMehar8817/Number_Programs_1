//22.	WAP to find sum of all the factors/divisors of a given number 8357002665

import java.util.Scanner;

public class Q21 {
     static int factors(int x){
        int count = 0;
        for(int i= 1; i<=x;i++){
            if(x%i==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        sc.close();
        int res = factors(x);
        System.out.println("The number of factors of x is :"+res);
    }
}
