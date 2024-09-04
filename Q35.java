//35.	WAP to print Fibonacci series starting with 2 and 5 up-to nth term using recursion

import java.util.Scanner;

public class Q35 {
     static int fibonacciSeries(int n,int sum,int a,int b){
            if(n==0){
                return 1;
            }
            System.out.print(b);
            return fibonacciSeries(n-1, sum = a+b, a=b, b=sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        sc.close();
        int a=3,b=2,sum=0;
        fibonacciSeries(n, sum, a, b);
    }
}
