// Here we are considering the right rotation. The movements will be just the opposite for left rotations.

// Intuition:

// In this technique, create a temporary array of size n, where n is the length of the original array. 
// If we rotate the array by d positions to right, the last d elements will be in the front. So, 
// copy the last d elements of the original array into the first d positions of the temporary array 
// and copy the remaining elements in the remaining positions. Finally, copy the elements of the temporary 
// array back into the original array starting at position 0.

public class UsingTemporaryArray {
    // Function to rotate array
    static void rotate(int arr[], int d, int n) {
        // Storing rotated version of array
        int temp[] = new int[n];

        // Keeping track of the current index
        // of temp[]
        int j = 0;

        // Storing the n - d elements of
        // array arr[] to the front of temp[]
        for (int i = d; i < n; i++) {
            temp[j] = arr[i];
            j++;
        }

        // Storing the first d elements of array arr[]
        // into temp
        for (int i = 0; i < d; i++) {
            temp[j] = arr[i];
            j++;
        }

        // Copying the elements of temp[] in arr[]
        // to get the final rotated array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    // Function to print elements of array
    static void printTheArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int N = arr.length;
        int d = 2;

        // Function calling
        rotate(arr, d, N);
        printTheArray(arr, N);
    }
}