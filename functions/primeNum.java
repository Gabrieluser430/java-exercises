package functions;

import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Type a number to see if it's prime or not: ");
            int num = in.nextInt();
            if (isPrime(num)) {
                System.out.println("That's a prime number!");
            } else {
                System.out.println("That's not a prime number!");
            }
        } 
    }

    static boolean isPrime(int n) {
        int factors = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                factors = factors + 1;
            }
        }
        if(factors > 2) {
            return false;
        }
        return true;
    }
}
