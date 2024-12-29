package if_else;

import java.util.Scanner;

public class ifelseQ2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 3 numbers");
        int number_1 = scanner.nextInt();
        int number_2 = scanner.nextInt();
        int number_3 = scanner.nextInt();
        float discount = (number_1 + number_2 + number_3) * 0.1f;
        int sum = number_1 + number_2 + number_3;

        if ((number_1 + number_2 + number_3) > 500) {
            System.out.println(discount);

        } else{
            System.out.println(sum);
            }



    }


}
