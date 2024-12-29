package functions;

import java.util.Random;
import java.util.Scanner;

public class funcsQ4 {
    public static void Randomnumber (int num ){
        for (int i = 0; i < num; i++) {
            Random random = new Random();
            int num2 = random.nextInt(0 , num);
            System.out.println(num2);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();
        Randomnumber(num);
    }
}
