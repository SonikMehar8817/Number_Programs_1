//Q2.Write a program to find sum of n whole number

    import java.util.*; 
    public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        sc.close();
        
        int Sum = 0;
        for(int i = 0; i<=n; i++){
           Sum = Sum + i;
        }
        System.out.println("The sum of n whole number is :"+Sum);
    }
}

