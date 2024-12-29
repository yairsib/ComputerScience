package LOOPS;

import java.util.Random;
import java.util.Scanner;

public class LoopQ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter max");
        int max = scanner.nextInt();
        System.out.println("enter min");
        int min = scanner.nextInt();
        int i = 0;
        for (i = 0 ; i < 5 ; i++){
            Random random = new Random();
            int num = random.nextInt(max,min);
            System.out.println(num);
        }
    }
}
