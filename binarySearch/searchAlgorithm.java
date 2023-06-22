package binarySearch;

public class searchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int ans = binarySearch(arr, 45);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
