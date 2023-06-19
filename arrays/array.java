import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        /*Can you print a 3x3 matrix?*/

        Scanner in = new Scanner(System.in);
        
        int[][] array2D = new int[3][3];

        for (int row = 0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[row].length; col++) {
                array2D[row][col] = in.nextInt();
                System.out.print(array2D[row][col] + " ");
            }
            System.out.println();
        }
    }
}
