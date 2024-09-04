//45.	WAP to convert Decimal to Hexadecimal

import java.util.Scanner;

public class Q45 {
    static int decimalToHexadecimal(int num){
         String result = "";
        while (num>0) {
            int rem = num % 16;
            num = num-rem;
            num = num /16;
            if (rem==10) {
                result = "A" + result;
            }
            else if (rem == 11) {
                result = "B" + result;
            }
            else if (rem == 12) {
                result = "C" + result;
            }
            else if (rem == 13) {
                result = "D" + result;
            }
            else if (rem == 14) {
                result = "E" + result;
            }
            else if (rem == 15) {
                result = "F" + result;
            }
            else{
            result = rem + result;
            }
        }
        System.out.print("The Hexadecimal number is :"+result);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number :");
        int n = sc.nextInt();
        sc.close();
        decimalToHexadecimal(n);
    }
}
