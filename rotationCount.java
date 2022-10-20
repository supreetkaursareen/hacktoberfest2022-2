public class rotationCount {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 9, 0, 1, 3};
        System.out.println(count(arr));
    }

    static int count(int[] arr) {
        return findPivot(arr) + 1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

}
