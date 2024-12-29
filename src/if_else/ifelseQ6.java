package if_else;

import java.util.Random;

public class ifelseQ6 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1001);
        System.out.println(number);
        if (number % 3 == 0) {
            System.out.println("you win");

        } else {
            System.out.println("failed");
        }




    }
}
