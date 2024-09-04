//29.	WAP to print factorial of a given number without recursion

import java.util.Scanner;

public class Q29 {
    static int factorial(int x){
        int fact = 1;
        for(int i=x; i>=1; i--){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        sc.close();

        int result = factorial(x);
        System.out.println("The factorial of number is :"+result);
    }
}
