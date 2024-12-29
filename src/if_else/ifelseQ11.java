package if_else;

import java.util.Scanner;

public class ifelseQ11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter double digits number");
        int number = scanner.nextInt();
        int sum = number % 10 + number/10;

        if (number < 10) {
            System.out.println("end");

        }else {
            System.out.println(sum);

        }
    }
}
