public class ArrayList {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Alternatively, you can add elements directly during initialization
        ArrayList<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Orange"));

        // Access elements in the ArrayList using get() method
        System.out.println("numbers.get(0): " + numbers.get(0)); // Output: 10
        System.out.println("fruits.get(2): " + fruits.get(2)); // Output: Orange

        // Get the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of numbers: " + size); // Output: 5

        // Iterate through all elements in the ArrayList using a loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("numbers[" + i + "]: " + numbers.get(i));
        }

        // Modify an element in the ArrayList using set() method
        numbers.set(2, 35);
        System.out.println("numbers after set: " + numbers); // Output: [10, 20, 35, 40, 50]

        // Remove an element from the ArrayList using remove() method
        fruits.remove(1); // Removes "Banana" from the ArrayList
        System.out.println("fruits after remove: " + fruits); // Output: [Apple, Orange]
    }
}