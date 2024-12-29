package functions;

import java.util.Scanner;

public class funcsQ1 {
    public static boolean BiggerThan10 (int num1, int num2 ,int num3){
        if (num1 >10 && num2 > 10 && num3 >10){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println(BiggerThan10(num1 , num2 , num3));
    }
}