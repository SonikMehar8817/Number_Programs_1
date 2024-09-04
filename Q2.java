//2.	WAP to display all natural numbers up-to n
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write a value of n :");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}
