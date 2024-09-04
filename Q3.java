//3.	WAP to display all whole numbers up-to n

import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write a value of n :");
        int n = sc.nextInt();
        sc.close();

        for(int i=0; i<=n; i++){
            System.out.println(i);
        }
    }
}


//Q2.Write a program to find sum of nth term whole number

//     import java.util.*; 
//     public class Q3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of n :");
//         int n = sc.nextInt();
//         sc.close();
        
//         int Sum = 0;
//         for(int i = 0; i<n; i++){
//            Sum = Sum + i;
//         }
//         System.out.println("The sum of n whole number is :"+Sum);
//     }
// }

