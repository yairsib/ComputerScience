package if_else;

import java.util.Scanner;

public class ifelseQ7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int number_1 = scanner.nextInt();
        int number_2 = scanner.nextInt();
        int number_3 = scanner.nextInt();

        if (number_1 > number_2) {
            if (number_1 > number_3){
                System.out.println("OK");
            }
        }
        else {
            System.out.println("fail");
        }




    }
}
