package binarySearch;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;
        int ans = numFloor(arr, target);
        System.out.println(ans);
    }

    static int numFloor(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        if (target < arr[0]) {
            return -1;
        }
        
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        } 
        return end;
    }
}
