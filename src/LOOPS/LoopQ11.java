package LOOPS;

import java.util.Scanner;

public class LoopQ11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < 3){
            System.out.println("enter a number");
            int num = scanner.nextInt();
            if (num > 100){
            if (num /10 % 10 - num / 100 - num % 10 == -num % 10)
                counter ++;
                System.out.println(counter + " of 3");
            } else {
                System.out.println("keep going");
            }
        }
        System.out.println("done");
    }
}
