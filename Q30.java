//30.	WAP to print factorial of a given number using recursion

import java.util.Scanner;

public class Q30 {
    static int factorial(int x){
        if(x==1)
            return 1;
        return x*factorial(x-1);
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
