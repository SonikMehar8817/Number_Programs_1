//5.	WAP to display all odd natural numbers up-to n

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        sc.close();

        for(int i=1;i<=n;i++){
            if(i%2!=0){
            System.out.println(i);
            }
        }
    }
}
