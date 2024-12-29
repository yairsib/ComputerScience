package LOOPS;

import java.util.Scanner;

public class LoopQ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        while (counter < 5) {
            System.out.println("enter a number");
            int num = scanner.nextInt();

        if (num % 2 == 0) {
            counter++;
            System.out.println(counter + " of 5");

        } else {
            System.out.println("keep trying");
        }

        }System.out.println("END");
    }
}

