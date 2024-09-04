//16.	WAP to print sum of digits of a given number

import java.util.Scanner;

public class Q16 {

    static int sumOfDigit(int x){
    //  int sum = 0;
    //    int count =x;
    //    for(int i=1;i<=count;i++){
        
    //     int a=x%10;
    //     int b = x-a;
    //     x=b/10; 
    //     sum = sum +a; 
    //    }

    //    return sum;
    int sum =0;
    while(x>0){
        int rem = x%10;
        sum = sum+rem;
        x=x/10;
    }
       return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sumOfDigit(x);
        sc.close();
       

        System.out.println(a);
    }
}
