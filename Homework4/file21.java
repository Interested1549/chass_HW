package Homework4;
import java.util.Scanner;
public class file21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Enter your name:");
        String name = scanner.next();
        for (int i = 0; i < age; i++) {
            System.out.println(name);
        }
    }

}
