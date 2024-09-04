//20.	WAP to find all the factors/divisors of a given number

import java.util.Scanner;

public class Q20 {
    static void factors(int x){
        for(int i= 1; i<=x;i++){
            if(x%i==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        sc.close();
        factors(x);
    }
}
