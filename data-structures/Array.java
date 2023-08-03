// * Array advantages
// - Randome access
// - Easy sorting and iteration
// - Replacement of multiple variables

// * Array disadvantages
// - Size is fixed
// - Difficult to insert and delete
// - If capacity is more and accupancy less, most of the array gets wasted
// - Needs contiguous menory to get allocated

public class Array {
    public static void main(String[] args) {
        // Declare an array of intergers with size 5
        int[] numbers = new int[5];
        // Assign values to each element in the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Altermatively, you can declare and initialize an array at once
        int[] numbers2 = {10, 20, 30, 40, 50};

        System.out.println("numbers[0]: " + numbers[0]); // Output: 10
        System.out.println("numbers2[2]: " + numbers2[2]); // Output: 30

        // Get the size of the array
        int size = numbers.length;
        System.out.println("Size of numbers: " + size); // Output: 5

        // Iterate through all elements in the array using a loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "]: " + numbers[i]);
        }

        // Array of strings (String)
        String[] fruits = {"Apple", "Banana", "Orange"};

        // Iterate through the string array using a foreach loop
        for (String fruis : fruits) {
            System.out.println(fruit);
        }
    }
}