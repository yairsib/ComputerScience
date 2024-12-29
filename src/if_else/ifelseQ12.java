package if_else;

import java.util.Scanner;

public class ifelseQ12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 digits number");
        int number = scanner.nextInt();
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        System.out.println(hundreds);
        System.out.println(tens);
        System.out.println(units);

        if (hundreds - tens == 1 && tens - units == 1){

        System.out.println("WIN");

    }else {
                System.out.println("fail");
            }

    }
}
