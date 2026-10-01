package Homework4;
import java.util.Scanner;

public class file42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's marks: ");
        double marks = scanner.nextDouble();
        char grade = 'F'; // Default grade is F
        if (marks > 75) {
            grade = 'A';
        } else if (marks > 60) { 
            grade = 'B';
        } else if (marks > 45) { 
            grade = 'C';
        } else if (marks > 35) { 
            grade = 'D';
        } else if (marks > 0) {                  
            grade = 'E';
        } else {
            System.err.println("Invalid marks. Please enter a value between 0 and 100.");
        }
        System.out.println("Grade: " + grade);
        scanner.close();
    }

}
