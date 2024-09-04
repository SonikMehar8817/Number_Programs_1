//33.	WAP to print Fibonacci series up-to nth term without recursion

import java.util.Scanner;

public class Q33 {
    static void fibonacciSeries(int n){
       int a = 0,b = 1;
       int sum = 0;
      for(int i=1;i<=n;i++){
           System.out.print(b);
           sum = a+b;
           a = b;
           b = sum;
      }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth term for fibonacci series :");
        int x = sc.nextInt();
        sc.close();
        fibonacciSeries(x);
    }
}