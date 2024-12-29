package LOOPS;

import java.util.Scanner;

public class LoopQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        if (limit > 0) {

            for (int i = 0; i < limit; i++) {
                System.out.println(i);
            }
        }else {
            System.out.println("failed");
        }
    }
}
