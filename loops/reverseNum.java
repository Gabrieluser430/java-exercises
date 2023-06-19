package loops;

import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = in.nextInt();
        int rem = 0;

        while (num > 0) {
            rem = rem + (num % 10);
            num = num / 10; 
            rem = rem * 10;
        }
        rem = rem / 10;
        System.out.println(rem);
    }
}
