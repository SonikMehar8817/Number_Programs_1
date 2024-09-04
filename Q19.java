//19.	WAP to check a number is palindrome or not

import java.util.Scanner;

public class Q19 {

    static int palindrome(int x){
        int rev = 0;
        while(x>0){
            int rem = x%10;
            rev = rev * 10 + rem;
            x = x/10;
        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        sc.close();

        int res = palindrome(x);
        if (x==res) {
            System.out.println("Number is palindrome");
        }
        else{
             System.out.println("Number is not palindrome");
        }
    }
}
