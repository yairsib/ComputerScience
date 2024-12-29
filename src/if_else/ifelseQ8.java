package if_else;

import java.util.Scanner;

public class ifelseQ8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of your tank");
        int size = scanner.nextInt();
        System.out.println("enter the amount of liters you have");
        int liters = scanner.nextInt();
        double total = (double) liters / size;
        if (total > 0.5) {
            System.out.println("youre fine");

        }
        else if (total < 0.15) {
            System.out.println("fuel low fill it now ");
        } else {
            System.out.println("recomend to fill your tank");
        }

    }
}






