package Homework4;

import java.util.Scanner;

public class file12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 1) {
                sum += 1;
            }
        }
        System.out.println("The sum of odd numbers from " + num1 + " to " + num2 + " is: " + sum);
    }

}
