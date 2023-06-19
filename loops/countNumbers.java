package loops;

import java.util.Scanner;

public class countNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        String num = in.next();
        System.out.print("Look how many times a number is in that: ");
        char calcNum = in.next().trim().charAt(0);

        int count = 0;

        for (int i = 0; i < num.length(); i++) {
            if (calcNum == num.charAt(i)) {
                count++;
            }
        }

        System.out.println("This number is repeated " + count + " times.");
    }
}
