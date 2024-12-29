package LOOPS;

import java.util.Scanner;

public class LoopQ6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("enter a number");
            int num = scanner.nextInt();
            if (num % 2 == 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
