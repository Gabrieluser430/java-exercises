package functions;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        boolean armstrongNum = checkArmstrong(num);
        System.out.println(armstrongNum);
    }

    static boolean checkArmstrong(int num) {
         int originalNum = num;
         int result = 0;
        while (num > 0) {
            int rem = num % 10;
            result = result + (rem * rem * rem);
            num = num / 10;
        }
        return (result == originalNum); 
    }
}
