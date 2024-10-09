import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedStack {
    /**
     * This code was reused from the SortedLinkedList code for week 4.
     * Since a stack doesn't allow for direct sorting, I made it collect intergers into an ArrayList<Integer> for sorting.
     * After sorting the list, I iterated over it to push each element onto the stack, which preserves the sorted order in the stack.
     * Then print the contents of the stack that contains the sorted integers.
     * @param args
     */
    
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Create a Stack to store Integer numbers
        Stack<Integer> numberStack = new Stack<>();
        
        System.out.println("Enter integers (type 'done' to finish):");
        
        // Create a List to temporarily hold the numbers for sorting
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Read input until the user types "done"
        while (true) {
            String input = scanner.nextLine();
            
            // Check if the user wants to stop input
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            
            try {
                // Parse the input as an Integer and add to the List
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                // Handle invalid input
                System.out.println("Please enter a valid integer or type 'done' to finish.");
            }
        }
        
        // Sort the List
        Collections.sort(numbers);
        
        // Push sorted numbers onto the Stack
        for (int number : numbers) {
            numberStack.push(number);
        }
        
        // Display the sorted Stack
        System.out.println("Sorted numbers in stack: " + numberStack);
        
        // Close the scanner
        scanner.close();
    }
}
