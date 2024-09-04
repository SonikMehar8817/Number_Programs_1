//write a program to find sum of n natural numbers
import java.util.*; 
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        sc.close();
        
        int Sum = 0;
        for(int i = 1; i<=n; i++){
           Sum = Sum + i;
        }
        System.out.println("The sum of n natural number is :"+Sum);
    }
}
