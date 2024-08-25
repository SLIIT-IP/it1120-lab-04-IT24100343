import java.util.Scanner;

public class IT24100343Lab4Q2 {


public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Input and validation for exam marks
System.out.print("Please enter exam marks (out of 100): ");
double examMarks = scanner.nextDouble();
if (examMarks < 0 || examMarks > 100) {
System.out.println("Invalid input for exam marks. Terminating program.");
return;
}

// Input and validation for lab submission marks
System.out.print("Please enter lab submission marks (out of 100): ");
double labMarks = scanner.nextDouble();
if (labMarks < 0 || labMarks > 100) {
System.out.println("Invalid input for lab marks. Terminating program.");
return;
}

// Input and validation for percentage of exam marks
System.out.print("Please enter the percentage given for the exam: ");
double examPercentage = scanner.nextDouble();
if (examPercentage < 0 || examPercentage > 100) {
System.out.println("Invalid input for exam percentage. Terminating program.");
return;
}

// Input and validation for percentage of lab submission marks
System.out.print("Please enter the percentage given for the lab submission: ");
double labPercentage = scanner.nextDouble();
if (labPercentage < 0 || labPercentage > 100) {
System.out.println("Invalid input for lab percentage. Terminating program.");
return;
}

// Validation to ensure the percentages add up to 100
if (examPercentage + labPercentage != 100) {
System.out.println("The percentages must add up to 100. Terminating program.");
return;
}

// Calculate the final exam mark
double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
System.out.println("Final Exam Mark is: " + finalMark);
}
}