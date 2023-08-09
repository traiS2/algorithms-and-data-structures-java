//Sequential Search: In this, the list or array is traversed sequentially and every element is checked. For example: Linear Search.

public class SequentialSearch {

    public static int linearSearch(int arr[], int N, int x) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        // Function linear search
        int result = linearSearch(arr, arr.length, x);
        if (result == -1)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result);
    }
}
