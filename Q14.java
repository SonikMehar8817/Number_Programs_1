//14.	WAP to find sum of all even numbers between two given range

import java.util.Scanner;

public class Q14 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting value :");
        int s = sc.nextInt();
        System.out.println("Enter Ending value :");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        int count = 0;
        for(int i=s; i<=n; i++){
            if(i%2==0){
            sum = sum+i;
            count++;
            }
        }
        int avj=sum/count;
        System.out.println("Average is :"+avj);
    }
}
