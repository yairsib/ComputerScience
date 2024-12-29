package if_else;

import java.util.Random;
import java.util.Scanner;

public class ifelseQ14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your bet");
        int bet = scanner.nextInt();
        Random random = new Random();
        int number = random.nextInt(2);
        int number_2 = random.nextInt(2);
        int number_3 = random.nextInt(2);
        System.out.println(number_3);
        System.out.println(number_2);
        System.out.println(number);

        if (number_3 == number_2 || number == number_2 || number == number_3) {
            System.out.println(bet * 2);

        } if (number_3 == number_2 && number == number_2 && number == number_3) {
                System.out.println(bet * 4);

            } else {
                System.out.println("you lost");
            }
// לא סיימתי את התרגיל

        }
    }

