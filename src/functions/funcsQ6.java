package functions;

import java.util.Scanner;

public class funcsQ6 {
    public static boolean avgGrade(int totalStudents){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < totalStudents; i++) {
            int grade = scanner.nextInt();
            sum += grade;
        }
        int avg = sum / totalStudents;
        if (avg > 60){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalStudents = scanner.nextInt();
        System.out.println("enter a " + totalStudents + " grades");
        System.out.println(avgGrade(totalStudents));

    }

}

