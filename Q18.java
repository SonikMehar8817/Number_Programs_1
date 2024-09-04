import java.util.Scanner;

class Q18{

    static int reversNumber(int x){
        int rev = 0;
        while(x>0){
            int rem = x%10;
            rev = rev*10+rem; 
            x = x /10;
        }
        return rev;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();

        int a = reversNumber(x);
        System.out.println(a);
        sc.close();
    }
}