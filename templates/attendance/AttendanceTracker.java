import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceTracker {
    public static void main(String[] args) {
        // Arrays to store user numbers and their corresponding roles
        String[] userNumbers = {
            "0", "1", "8",
        };
        
        String[] roles = {
            "Something",
            "Somehting",
            "Something else",
        };

        // List to keep track of accepted users
        ArrayList<String> acceptedUsers = new ArrayList<>();
        ArrayList<String> acceptedRoles = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a user number: ");
            String userInput = scanner.nextLine();

            // Break the loop if the user types 'exit'
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }

            // Check if the entered number is valid
            boolean found = false;
            for (int i = 0; i < userNumbers.length; i++) {
                if (userNumbers[i].equals(userInput)) {
                    found = true;
                    // If valid, add to accepted users if not already present
                    if (!acceptedUsers.contains(userInput)) {
                        acceptedUsers.add(userInput);
                        acceptedRoles.add(roles[i]); // Keep track of the accepted role
                        System.out.println("User " + userInput + " accepted for roles: " + roles[i]);
                        System.out.println("Position accepted: " + roles[i]);
                    } else {
                        System.out.println("User " + userInput + " has already been accepted.");
                    }
                    break;
                }
            }

            if (!found) {
                System.out.println("User number " + userInput + " is not valid.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
