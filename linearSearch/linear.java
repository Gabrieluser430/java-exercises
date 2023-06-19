package linearSearch;

public class linear {
    public static void main(String[] args) {
        int[] arr = {10, 15, 19, 14, 20};
        int index = numIndex(arr, 14);
        System.out.println(index);
    }

    static int numIndex(int[] arr, int number) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
            } 
        }
        return index;
    }
}
