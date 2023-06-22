package binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int ans = agnosticBinarySearch(arr, 22);
        System.out.println(ans);
    }

    static int agnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(arr[start] > arr[end]) {
            return descendingBinarySearch(arr, target);
        } else if (start < end) {
            return ascendingBinarySearch(arr, target);
        } else {
            return 0;
        }
    }

    static int ascendingBinarySearch(int[] arr, int target) {
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

    static int descendingBinarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
