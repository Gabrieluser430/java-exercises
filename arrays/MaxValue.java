import java.util.Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 19, 130};

        // int result = maxValue(arr);
        // System.out.println(result); 
         reverse(arr);
         System.out.println(Arrays.toString(arr));
    }

    static int maxValue(int[] array) {
        int currentMax = 0; 

        for (int i = 0; i < array.length; i++) {
            if (currentMax < array[i]) {
                currentMax = array[i];
            }
        }
        return currentMax;
    }
    /*TWO POINTERS */
    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
