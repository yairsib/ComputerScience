package if_else;

import java.util.Scanner;

public class ifelseQ13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter salary");
        int salary = scanner.nextInt();
        System.out.println("sell target");
        int target = scanner.nextInt();
        System.out.println("sells profit");
        int profit = scanner.nextInt();
        float bonus_2000 = target * 0.5f;
        float bonus_75 = salary * 1.75f;

        if (profit > target) {
            System.out.println(bonus_75);

        } else if (profit > bonus_2000) {
            System.out.println(salary + 2000);

        } else {
            System.out.println(salary);

            }
        }

    }

