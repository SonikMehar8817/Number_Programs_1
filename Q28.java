//28.	WAP to find sum of all prime numbers between two given range

import java.util.Scanner;

public class Q28 {
    static int sumOfPrimeNumber(int x,int y){
        int sum = 0;
        for(int i=x; i<=y; i++){
            int count = 0;
            for (int j=2; j<i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                sum = sum + i;
            }
        }
        return sum;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int x = sc.nextInt();
        System.out.println("Enter secound number :");
        int y = sc.nextInt();
        sc.close();
        int res=sumOfPrimeNumber(x,y);
        System.out.println("Sum of all prime numbers :"+res);
    }
}
