//36.	WAP to find gcd/hcf of  given numbers  without recursion

import java.util.Scanner;

public class Q36 {
    static int HCF (int x,int y){
           int gcd=0;
           for(int i=1;i<=x;i++){
            if(x%i==0){
                for(int j=1;j<=y;j++){
                    if (y%j==0) {
                        if (i==j) {
                            gcd = i;
                            break;
                        }
                    }
                }
            }

           }
           return gcd;
    }

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int x = sc.nextInt();
        System.out.println("Enter secound number :");
        int y = sc.nextInt();
        sc.close();
        int res = HCF(x,y);
        System.out.println("Highest comman factor is :"+res);
    }


}
