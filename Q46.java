//46.	WAP to generate random numbers 

import java.util.Random;
public class Q46 {
    public static void main(String[] args) {
        int number;
        Random random = new Random();
        // number = random.nextInt();
        // number = random.nextInt(10);
        number = random.nextInt(50,60);
        System.out.println("Random number is : "+number);
        // double a = Math.random();
        // System.out.println(a);

    }
}
