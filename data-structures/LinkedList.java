public class LinkedList {
    public static void main(String[] args) {
        // Example 1: Adding and Removing Elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        System.out.println("LinkedList after adding elements: " + linkedList); // Output: [Apple, Banana, Orange]

        linkedList.addFirst("Grapes");
        System.out.println("LinkedList after adding 'Grapes' at the beginning: " + linkedList); // Output: [Grapes, Apple, Banana, Orange]

        linkedList.addLast("Cherry");
        System.out.println("LinkedList after adding 'Cherry' at the end: " + linkedList); // Output: [Grapes, Apple, Banana, Orange, Cherry]

        linkedList.remove("Banana");
        System.out.println("LinkedList after removing 'Banana': " + linkedList); // Output: [Grapes, Apple, Orange]

        linkedList.removeFirst();
        System.out.println("LinkedList after removing first element: " + linkedList); // Output: [Apple, Orange]

        linkedList.removeLast();
        System.out.println("LinkedList after removing last element: " + linkedList); // Output: [Apple]

        System.out.println();

        // Example 2: Accessing Elements in LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        String firstElement = linkedList.getFirst();
        System.out.println("First element: " + firstElement); // Output: Apple

        String lastElement = linkedList.getLast();
        System.out.println("Last element: " + lastElement); // Output: Orange

        System.out.println("Elements in the LinkedList:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        System.out.println();

        // Example 3: Sorting a LinkedList
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(10);
        numbers.add(1);
        numbers.add(7);

        System.out.println("Before sorting: " + numbers); // Before sorting: [5, 2, 10, 1, 7]

        Collections.sort(numbers);
        System.out.println("After sorting: " + numbers); // After sorting: [1, 2, 5, 7, 10]

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("After sorting in descending order: " + numbers); // After sorting in descending order: [10, 7, 5, 2, 1]
    }
}
