package linearSearch;

public class MinValue {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 1, 30, 54};
        int ans = minValue(arr);
        System.out.println(ans);
    }

    static int minValue(int[] arr) {
        
        int num = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (num > arr[i]) {
                num = arr[i];
            }
        }

        return num;
    }
}
