//12.	WAP to find the average of all natural numbers up-to n
import java.util.*;;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write a value of n :");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
        int avj = sum/n;
        System.out.println("Average of n numbers :"+avj);
    }
}

