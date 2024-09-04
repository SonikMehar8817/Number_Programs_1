//39.	WAP to print all the Armstrong/Strong numbers between two given range

import java.util.Scanner;

public class Q39 {
    static int countNumber(int num){
        int count = 0;
        while (num>0) {
            num = num/10;
            count++;
        }
        return count;
    }

    static int countPower(int num){
        int sum = 0;
        int power = countNumber(num);
        while (num>0) {
            int count = 1;
            int rem = num%10;
            num = num/10;
            for(int i=1;i<=power;i++)
                count = count*rem;
            sum = sum + count;
        }
        return sum;
    }

    static boolean armstrongNumber(int num){
        int retult = countPower(num);
        if (num == retult) 
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter secound number :");
        int num2 = sc.nextInt();
        sc.close();

       for(int i=num1;i<=num2;i++){
         if (armstrongNumber(i)) 
            System.out.println(i);
       }
        
    }

}
