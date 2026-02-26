public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1; // base case: not found
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target)
            return mid; // found
        else if (arr[mid] < target)
            return recursiveBinarySearch(arr, mid + 1, right, target); // search right half
        else
            return recursiveBinarySearch(arr, left, mid - 1, target); // search left half
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // must be sorted
        int target = 50;

        int result = recursiveBinarySearch(numbers, 0, numbers.length - 1, target);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
