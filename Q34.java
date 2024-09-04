//34.	WAP to print Fibonacci series up-to nth term using recursion

import java.util.Scanner;

public class Q34 {
    static int fibb(int n){
            // if(n==0){
            //     return 1;
            // }
            // System.out.print(b);
            // return fibonacciSeries(n-1, sum = a+b, a=b, b=sum);

            if(n==0){
                return 0;
            }
            if(n==1){
                return 1;
            }
            return fibb(n-1)+fibb(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        sc.close();
        // int a=0,b=1,sum=0;
        for(int i=0;i<n;i++){
            System.out.println(fibb(i));
        }
    }
}

