import java.util.Arrays;

public class swapNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 18, 27};
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }
    /*TWO POINTERS */
    static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
