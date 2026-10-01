package Homework4;
import java.util.Scanner;
public class file43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of y: ");
        int y = scanner.nextInt();
        if (x < 2000 || x > 3000) {
            System.out.println("x: " + x);
        }
        if (y >= 100 && y <= 500) {
            System.out.println("y: " + y);
        }
        scanner.close();
    }

}
