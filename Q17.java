//17.	WAP to count the number of digits of a given number

import java.util.Scanner;

public class Q17 {
     static int sumOfDigit(int x){
   
    int sum =0;
    while(x>0){
        int dd=x%10;
        sum ++;
        x=x/10;
    }
       return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();

        int a = sumOfDigit(x);
        sc.close();
       

        System.out.println(a);
    }
}


