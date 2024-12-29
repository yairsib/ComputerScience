package ClassPractice;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;
        do {
            System.out.println("enter valid grade");
            grade = scanner.nextInt();

        } while (grade < 0 || grade > 100);
        System.out.println("the grade " + grade);
    }
}

