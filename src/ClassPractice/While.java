package ClassPractice;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();

        while (num > 0 ){
            num -- ;
            System.out.println(num);
        }
    }
}
