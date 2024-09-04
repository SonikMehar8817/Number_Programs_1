// 43.	WAP to convert Decimal to Octal

import java.util.Scanner;

public class Q43 {

    static int decimalToOctal(int num){
         String result = "";
        while (num>0) {
            int rem = num % 8;
            num = num-rem;
            num = num /8;
            result = rem + result;
        }
        int i = Integer.parseInt(result);
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n = sc.nextInt();
        sc.close();
        System.out.println(decimalToOctal(n));
    }
}
