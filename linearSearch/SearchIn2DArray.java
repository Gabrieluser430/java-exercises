package linearSearch;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };
        // int target = 34;
        // System.out.println(search(arr, target));
        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 1; col < arr[row].length; col++) {
                if (max < arr[row][col]) {
                    max = arr[row][col];
                }
            }
        }
        return max; 
    }

    static boolean search(int[][] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
