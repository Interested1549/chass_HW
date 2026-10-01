package Homework4;

public class file31 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();
        System.out.println("enter your grade:");
        char grade = scanner.next().charAt(0);
        int allowance = 100;
        if (salary < 0) {
            System.out.println("Salary cannot be negative.");
            return;
        }
        switch (grade) {
            case 'A','a':
                allowance = 300;
                break;
            case 'B','b':
                allowance = 250;
                break;
            default:
                allowance = 100;
                break;
        }
        System.out.println("your salary is:" + (salary + allowance));
    }


}
