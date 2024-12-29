package if_else;

import java.util.Scanner;

public class ifelseQ10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();
        int num_3 = scanner.nextInt();
        int diff = num_1 - num_2;

        if (diff == num_2 - num_3){
            System.out.println(num_1 + diff);
        }
    }
}
