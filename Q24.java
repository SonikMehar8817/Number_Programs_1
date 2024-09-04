//24.	WAP to print all perfect numbers between two given range

import java.util.Scanner;

public class Q24 {
    static void allPerfectNumber(int x,int y){
        for(int i=x; i<y; i++){
            int sum = 0;
            for(int j=1;j<i;j++){
            if (i%j==0) {
                sum = sum + j;
            }
        }
        if (i==sum) {
            System.out.println("Perfect number is :"+sum);
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
        allPerfectNumber(x,y);
      
    }
}
