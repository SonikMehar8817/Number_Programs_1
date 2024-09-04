//42.	WAP to convert Octal to Decimal

import java.util.Scanner;

public class Q42 {

    static int octalToDecimal(int  num){
        int  count = 0;
        int res = 0;
        
        while (num>0) {
            int rem = num %10;
            int power = (int)Math.pow(8, count);
            int k = rem*power;
            res = res +k;
            num=num/10;
            count ++;
        }
        return res;
    }  
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a octol number :");
        int number = sc.nextInt();
        sc.close();
        System.out.println(octalToDecimal(number));
    }

    // static int octalToBinary(int val){  //2345
    //      String finalVal = "";
    //     while (val>0) {
    //     int rem = val%10;
    //     val = val/10;
    //    String result = "";
    //     while (rem>0) {
    //         int res = rem % 2;
    //         rem = rem-res;
    //         rem = rem /2;
    //         result = res + result;
    //     }
    //     if (result.length()<3) {
    //         result = "0"+result;
    //     }
    //   finalVal = result +finalVal;
    // }
    //     int i = Integer.parseInt(finalVal);
    //     return i;

    // }

    // static int binarToDecimal(int  num2){
    //     int num = octalToBinary(num2);
    //     int  count = 0;
    //     int res = 0;
        
    //     while (num>0) {
    //         int rem = num %2;
    //         int power = (int)Math.pow(2, count);
    //         int k = rem*power;
    //         res = res +k;
    //         num=num/10;
    //         count ++;
    //     }
    //     return res;
    // }  
   
}
