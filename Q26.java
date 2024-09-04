//26.	WAP to print all the prime numbers between two given range

import java.util.Scanner;

public class Q26 {
    static void primeNumber(int x,int y){
        
        for(int i=x; i<y; i++){
            int count = 0;
            for(int j=2;j<i;j++){
             if(i%j==0){
                count++;
             }
            }
          if (count==0) {
            System.out.println(i);
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
        primeNumber(x,y);
      
    }
}
