// Intuition:

// If observed closely, we can see that a group of array elements is changing its position. For example see the following array:
// arr[] = {1, 2, 3, 4, 5, 6} and d = 2. The rotated array is {3, 4, 5, 6, 1, 2}
// The group having the first two elements is moving to the end of the array. This is like reversing the array.
// But the issue is that if we only reverse the array, it becomes { 6, 5, 4, 3, 2, 1}. 
// After rotation, the elements in the chunks having the first 5 elements { 6, 5, 4, 3} and the last 2 elements {2, 1} should be in the actual order as of the initial array [i.e., {3, 4, 5, 6} and {1, 2}]but here it gets reversed. 
// So if those blocks are reversed again we get the desired rotated array.
// So the sequence of operations is:

// Reverse the whole array 
// Then reverse the last ‘d’ elements and 
// Then reverse the first (N-d) elements.
// As we are performing reverse operations it is also similar to the following sequence:

// Reverse the first ‘d’ elements
// Reverse last (N-d) elements
// Reverse the whole array.

public class ReversalAlgorithm {
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