import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Ask for the user's age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Display the input back to the user
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Close the scanner
        sc.close();
    }
}