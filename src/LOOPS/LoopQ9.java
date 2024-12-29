package LOOPS;

import java.util.Scanner;

public class LoopQ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0 ;

        while (counter < 5){
            System.out.println("enter a num");
            float num = scanner.nextFloat();
            if (num / 10 >= 1){
                counter ++;
                System.out.println(counter + " of 5");
            }
        }
    }
}
