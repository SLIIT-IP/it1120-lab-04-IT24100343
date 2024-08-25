import java.util.Scanner;

public class IT24100343Lab4Q1 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// Prompt user to enter a number
System.out.print("Enter a number: ");
int number = scanner.nextInt();

// Determine if the number is positive, negative, or zero
if (number > 0) {
System.out.println("The number is: Positive");
} else if (number < 0) {
System.out.println("The number is: Negative");
} else {
System.out.println("The number is Zero");
}

// Close the scanner to avoid resource leak
scanner.close();
}
}