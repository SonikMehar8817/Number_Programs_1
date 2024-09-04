
import java.util.Scanner;
//41.	WAP to convert Decimal to Binary



public class Q41 {
     static int DecimalToBinary(int num){
        String result = "";
        while (num>0) {
            int res = num % 2;
            num = num-res;
            num = num /2;
            result = res + result;
        }
        int i = Integer.parseInt(result);
        return i;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        sc.close();
        System.out.println(DecimalToBinary(n));
    }
}
