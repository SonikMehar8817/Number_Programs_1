//27.	WAP to print alternate prime numbers between two given range

import java.util.Scanner;

public class Q27 {
    static void alternatdPrimeNumber(int x,int y){
      
        int a = 0;
        for(int i=x; i<=y; i++){
              int count = 0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                if(a%2==0){
                System.out.println(i);
                }
                a++;
            
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int x = sc.nextInt();
        System.out.println("Enter secound number :");
        int y = sc.nextInt();
        sc.close();
        alternatdPrimeNumber(x,y);
    }
}
