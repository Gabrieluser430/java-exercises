package loops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int first = 0;
        int second = 1;


        for (int i = 0; i < n - 2; i++) {
            int num = second;
            second = second + first;
            first = num; 
        }

        System.out.println(second);
    }
}
