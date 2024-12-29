package ClassPractice;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter");
        int num = scanner.nextInt();
        for (num = num ; num > 0 ; num--){
            System.out.println(num);
        }

    }
}
