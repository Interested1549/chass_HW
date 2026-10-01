package Homework4;

import java.util.Scanner;

public class file32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the letter of your first letter of code language: ");
        char letter = scanner.next().charAt(0);
        // create a switch of the code language
        switch (letter) {
            case 'A','a':
                System.out.println("Ada");
                break;
            case 'B','b':       
                System.out.println("Basic");
                break;
            case 'C','c':
                System.out.println("Cobol");
                break;
            case 'D','d':
                System.out.println("dBase III");
                break;
            case 'F','f':
                System.out.println("Fortran");
                break;
            case 'P','p':
                System.out.println("Pascal");
                break;
            case 'V','v':
                System.out.println("Visual C++");
                break;
            default:
                System.out.println("Unknown language");

    }
}
}
