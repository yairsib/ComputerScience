package if_else;

import java.util.Scanner;

public class ifelseQ3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int number_1 = scanner.nextInt();
        System.out.println("Enter 2nd number");
        int number_2 = scanner.nextInt();
        System.out.println("Enter 3rd number");
        int number_3 = scanner.nextInt();

        int dif1 = number_2 - number_1;
        int dif2 = number_3 - number_2;

        if (dif1 == dif2) {
            System.out.println("YES");

        } else {
            System.out.println("NO");

        }


    }
}
