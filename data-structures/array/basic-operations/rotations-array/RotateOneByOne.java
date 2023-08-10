// Here we are considering left rotation. The movements will be just the opposite for right rotation.

// Intuition:

// At each iteration, shift the elements by one position to the left circularly (i.e., first element becomes the last).
// Perform this operation d times to rotate the elements to the left by d position.

// Illustration:

// Let us take arr[] = [1, 2, 3, 4, 5, 6], d = 2.

// First Step:
//         => Rotate to left by one position.
//         => arr[] = {2, 3, 4, 5, 6, 1}
// Second Step:
//         => Rotate again to left by one position
//         => arr[] = {3, 4, 5, 6, 1, 2}
// Rotation is done 2 times.
// So the array becomes arr[] = {3, 4, 5, 6, 1, 2}

// Below are the steps to solve using the above approach:

// Rotate the array to left by one position. For that do the following:
// Store the first element of the array in a temporary variable.
// Shift the rest of the elements in the original array by one place.
// Update the last index of the array with the temporary variable.
// Repeat the above steps for the number of left rotations required.

public class RotateOneByOne {
    public static void rotate(int arr[], int d, int n) {
        int p = 1;
        while (p <= d) {
            int last = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = last;
            p++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Driver's code
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        // Rotate 2 times
        int d = 2;

        // Function call
        rotate(arr, d, n);
    }
}