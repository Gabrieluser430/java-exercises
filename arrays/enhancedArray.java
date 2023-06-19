import java.util.Arrays;
import java.util.Scanner;

public class enhancedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] array2D = new int[3][3];

        for (int row = 0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[row].length; col++) {
                array2D[row][col] = in.nextInt();
            }
        }

        for (int[] a : array2D) {
            System.out.println(Arrays.toString(a));
        }
    }
}
