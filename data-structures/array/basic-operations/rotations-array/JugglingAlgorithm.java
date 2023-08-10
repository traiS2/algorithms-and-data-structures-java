// Intuition:

// Instead of moving one by one, divide the array into different sets where the number of sets is equal to the GCD of n and d (say x. So the elements which are x distance apart are part of a set) and rotate the elements within sets by 1 position to the left. 

// Calculate the GCD between the length and the distance to be moved.
// The elements are only shifted within the sets.
// We start with temp = arr[0] and keep moving arr[I+d] to arr[I] and finally store temp at the right place.

// Juggling Algorithm
// Juggling Algorithm

// Illustration:

// Let arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14} and d = 10
// First step:
//        => First set is {0, 5, 10}.
//        => Rotate this set by d position in cyclic order
//        => arr[0] = arr[0+10]
//        => arr[10] = arr[(10+10)%15]
//        => arr[5] = arr[0]
//        => This set becomes {10,0,5}
//        => Array arr[] = {10, 1, 2, 3, 4, 0, 6, 7, 8, 9, 5, 11, 12, 13, 14}
// Second step:
//        => Second set is {1, 6, 11}.
//        => Rotate this set by d position in cyclic order.
//        => This set becomes {11, 1, 6}
//        => Array arr[] =  {10, 11, 2, 3, 4, 0, 1, 7, 8, 9, 5, 6, 12, 13, 14}
// Third step:
//        => Second set is {2, 7, 12}.
//        => Rotate this set by d position in cyclic order.
//        => This set becomes {12, 2, 7}
//        => Array arr[] =  {10, 11, 12, 3, 4, 0, 1, 2, 8, 9, 5, 6, 7, 13, 14}
// Fourth step:
//        => Second set is {3, 8, 13}.
//        => Rotate this set by d position in cyclic order.
//        => This set becomes {13, 3, 8}
//        => Array arr[] =  {10, 11, 12, 13, 4, 0, 1, 2, 3, 9, 5, 6, 7, 8, 14}
// Fifth step:
//        => Second set is {4, 9, 14}.
//        => Rotate this set by d position in cyclic order.
//        => This set becomes {14, 4, 9}
//        => Array arr[] =  {10, 11, 12, 13, 14, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}

// Below are the steps to solve using the above approach: 

// Perform d%n in order to keep the value of d within the range of the array where d is the number of times the array is rotated and n is the size of the array.
// Calculate the GCD(n, d) to divide the array into sets.
// Run a for loop from 0 to the value obtained from GCD.
// Store the value of arr[i] in a temporary variable (the value of i denotes the set number).
// Run a while loop to update the values according to the set.
// After exiting the while loop assign the value of arr[j] as the value of the temporary variable (the value of j denotes the last element of the ith set).

public class JugglingAlgorithm {
    /* Function to left rotate arr[] of siz n by d */
    void leftRotate(int arr[], int d, int n) {
        /* To handle if d >= n */
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    /* UTILITY FUNCTIONS */

    /* function to print an array */
    void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    /* Function to get gcd of a and b */
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    // Driver's code
    public static void main(String[] args) {
        RotateArray rotate = new RotateArray();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = 6;
        int d = 2;
        rotate.leftRotate(arr, d, n);
        rotate.printArray(arr, n);
    }
}