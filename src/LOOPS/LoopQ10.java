package LOOPS;

import java.util.Scanner;

public class LoopQ10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0 ;
        while (counter < 5){
            System.out.println("enter a num");
            float num = scanner.nextFloat();
            if (num % 1 == 0){
                counter ++;
                System.out.println(counter + " of 5");
            } else {
                System.out.println("keep going");
            }
        }
        System.out.println("Done");
    }
}
