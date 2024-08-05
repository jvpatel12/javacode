//serach in rotated sorted in array
public class leetcode33 {

    static int search(int arr[], int target) {
        int pivot = findPivot(arr);
        // if you did not find a pivot it means the array is not rotated
        if (pivot == -1) {
            return binarys(arr, target, 0, arr.length - 1);
        }
        // if you find pivot the find two asc order array

        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarys(arr, target, 0, pivot - 1);
        }
        return binarys(arr, target, pivot + 1, arr.length - 1);
    }

    static int binarys(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // 4 case in overhere
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid >start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int ans = findPivot(arr);
        System.out.println(ans);
    }
}
