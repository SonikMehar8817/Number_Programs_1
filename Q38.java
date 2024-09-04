//38.	WAP to check if a number is Armstrong/Strong

import java.util.Scanner;

public class Q38 {
    static int countNumber(int x){
        int count = 0;
        while (x>0) {
            x = x/10;
            count++;
        }
        return count;
    }

    static int power(int x){
        int count=0;
        int pow = countNumber(x);
        while (x>0) {
            int result = 1;
            int res = x%10;
            x = x/10;
            for(int j=1;j<=pow;j++){
                result = res*result;
            }
            count = count + result;
        }
        return count;
    }

    static boolean armstrongNumber(int num){
        int retult = power(num);
        if (num == retult) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        sc.close();
        if(armstrongNumber(x))
            System.out.println("It is a Armstrong number");
        else
            System.out.println("It is not a Armstrong number");
    }
}
