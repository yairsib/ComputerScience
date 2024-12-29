package LOOPS;

import java.util.Scanner;

public class LoopQ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("start");
        int start = scanner.nextInt();
        System.out.println("End");
        int end = scanner.nextInt();
        int i;

        if (end > start){
            for ( i = 0 ; i < end; i++){
                System.out.println(i);
            }
            System.out.println(i);
        }

    }
}
