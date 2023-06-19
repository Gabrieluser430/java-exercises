package loops;
import java.util.Scanner;


public class newFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.print("Enter a number: ");
        int b = in.nextInt();
        System.out.print("Enter a number: ");
        int c = in.nextInt();

        int max = a;

        /*Find the largest number among these 3 */
            if (b > max) {
                    max = b;
            } 

            if (c > max) {
                    max = c;
            } 

                System.out.println(max);
    }
}
