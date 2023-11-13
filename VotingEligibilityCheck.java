import java.util.Scanner;

// Custom exception class to handle age less than 18
class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

public class VotingEligibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        try {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

            if (age < 18) {
                throw new AgeException("You are not eligible to vote. Age must be 18 or higher.");
            } else {
                System.out.println("You are eligible to vote!");
            }
        } catch (AgeException e) {
            System.out.println("Age Exception: " + e.getMessage());
             }catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid age.");
        } 
        finally {
            scanner.close();
        }
    }
}
