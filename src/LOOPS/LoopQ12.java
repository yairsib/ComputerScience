package LOOPS;

import java.util.Scanner;

public class LoopQ12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a num");
        int num = scanner.nextInt();
        int i = 0 ;
        while (i < num){
            i++;
            System.out.println(i);
        if (i % 7 == 0){
            System.out.println("BOOM!");
        }
        }
    }
}
