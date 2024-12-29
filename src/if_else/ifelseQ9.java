package if_else;

import java.util.Random;

public class ifelseQ9 {
    public static void main(String[] args) {
        Random random = new Random();
        int number_1 = random.nextInt(6);
        int number_2 = random.nextInt(6);
        int number_3 = random.nextInt(6);
        System.out.println(number_1);
        System.out.println(number_2);
        System.out.println(number_3);
        if (number_1 - number_2 == number_2 - number_3) {
            System.out.println("You WIN");

        } else {
            System.out.println("fail");
        }
    }
}
