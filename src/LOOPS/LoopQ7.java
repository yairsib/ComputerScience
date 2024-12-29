package LOOPS;

import java.util.Scanner;

public class LoopQ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int count = scanner.nextInt();
        int sum =0;
        for (int i = 0 ; i < count; i++){
            System.out.println("enter a number");
            int new_num = scanner.nextInt();
            sum = sum + new_num;
        }
        int avarage = sum/count;
        System.out.println("the average is " + avarage);


    }
}
