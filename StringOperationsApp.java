
package javaapplication55;
import java.util.ArrayList;
import java.util.Scanner;

public class StringOperationsApp {

    public static void main(String[] args) {
        // Create an ArrayList to store strings
        try (Scanner scanner = new Scanner(System.in)) {
            // Create an ArrayList to store strings
            ArrayList<String> stringList = new ArrayList<>();
            
            // Get input from the user to populate the list
            System.out.print("Enter the number of strings: ");
            int numStrings = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            for (int i = 0; i < numStrings; i++) {
                System.out.print("Enter string " + (i + 1) + ": ");
                String inputString = scanner.nextLine();
                stringList.add(inputString);
            }
            
            // Display the original list
            System.out.println("\nOriginal List:");
            displayList(stringList);
            
            // Search for a specific string
            System.out.print("\nEnter a string to search: ");
            String searchString = scanner.nextLine();
            searchAndDisplay(stringList, searchString);
            
            // Display strings that begin and end with given letters
            System.out.print("\nEnter the starting letter: ");
            char startLetter = scanner.next().charAt(0);
            System.out.print("Enter the ending letter: ");
            char endLetter = scanner.next().charAt(0);
            displayStringsByLetters(stringList, startLetter, endLetter);
        }
    }

    // Method to display the contents of the list
    private static void displayList(ArrayList<String> list) {
        for (String str : list) {
            System.out.println(str);
        }
    }

    // Method to search for a specific string and display the result
    private static void searchAndDisplay(ArrayList<String> list, String searchString) {
        if (list.contains(searchString)) {
            System.out.println("String found in the list.");
        } else {
            System.out.println("String not found in the list.");
        }
    }

    // Method to display strings that begin and end with given letters
    private static void displayStringsByLetters(ArrayList<String> list, char startLetter, char endLetter) {
        System.out.println("\nStrings beginning with '" + startLetter + "' and ending with '" + endLetter + "':");
        for (String str : list) {
            if (str.startsWith(String.valueOf(startLetter)) && str.endsWith(String.valueOf(endLetter))) {
                System.out.println(str);
            }
        }
    }
}
