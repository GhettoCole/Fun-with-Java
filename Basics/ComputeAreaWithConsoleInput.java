import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
   public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user for the radius of the circle
    System.out.print("Enter the radius of the circle: ");
    double radius = input.nextDouble();

    // Calculate the area of the circle
    double area = Math.PI * radius * radius;

    // Display the result
    System.out.println("The area of the circle with the radius " + radius + " is " + area);
   }
}