package LOOPS;

import java.util.Scanner;

public class LoopQ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int counter = 0;
        int num = 0;
        for (i = 0; i < 5; i++) {
            System.out.println("enter a number");
            num = scanner.nextInt();
            if (num > 10) {
                counter++;



            }

        } System.out.println(counter + " numbers are bigger than 10");
    }
}
