//4.	WAP to display all even natural numbers up-to n
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        sc.close();

        for(int i=1;i<=n;i++){
            if(i%2==0){
            System.out.println(i);
            }
        }
    }
}
