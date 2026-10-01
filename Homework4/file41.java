package Homework4;
import java.util.Scanner;
public class file41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double differencea = (num1 - num2);
        double differenceb = (num2 - num1);
        if (differencea == num1 || differenceb == num1) {
            System.out.println("Difference is equal to value 1");
        } else if (differenceb == num2 || differencea == num2) {
            System.out.println("Difference is equal to value 2");
        } else {
            System.out.println("Difference is not equal to any of the values entered");
        }

        scanner.close();
    
}


}
