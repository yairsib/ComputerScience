package LOOPS;

import java.util.Scanner;

public class LoopQ13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        Integer num2 = null;
        int counter = 0;
        do {
            System.out.println("enter a number");
            int num = scanner.nextInt();
            if (num2 != null && num - 1 == num2) {

                counter++;
            } else {
                counter = 0;

            }
            num2 = num;
        }
        while (counter < 2);

    }
}
