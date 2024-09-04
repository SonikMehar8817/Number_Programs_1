//40.	WAP to convert Binary to Decimal

import java.util.Scanner;
import java.lang.Math;

public class Q40 {
    static int binarToDecimal(int  num){
        int  count = 0;
        int res = 0;
        
        while (num>0) {
            int rem = num %2;
            int power = (int)Math.pow(2, count);
            int k = rem*power;
            res = res +k;
            num=num/10;
            count ++;
        }
        return res;
    }  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        sc.close();
        int res = binarToDecimal(n);
        System.out.println(res);
        
          

    }
}
