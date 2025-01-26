import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        // Predefined credentials
        String correctUsername = "user001";
        String correctPassword = "pass";
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their username
        System.out.print("Enter your username: ");
        String inputUsername = scanner.nextLine();

        // Ask the user for their password
        System.out.print("Enter your password: ");
        String inputPassword = scanner.nextLine();

        // Check if the entered username and password are correct
        if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        // Close the scanner
        scanner.close();
    }
}
