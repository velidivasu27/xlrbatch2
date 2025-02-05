import java.util.Scanner;

public class DEMO7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        
        System.out.println("\n--- User Information ---");
        System.out.println("Password: " + password);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Age: " + age);

       
        scanner.close();
    }
}
