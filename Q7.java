//7.	WAP to find all even numbers between two given range

import java.util.Scanner;

public class Q7 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting value :");
        int s = sc.nextInt();
        System.out.println("Enter Ending value :");
        int n = sc.nextInt();
        sc.close();

        for(int i=s; i<=n; i++){
            if(i%2==0){
            System.out.println(i);
            }
        }
    }
}
