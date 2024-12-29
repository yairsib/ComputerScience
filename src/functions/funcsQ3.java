package functions;

import java.util.Scanner;

public class funcsQ3 {
    public static boolean func1 (int num1 , int num2 , int num3){
        if (num1 >0 && num2>0 || num2>0 && num3 >0 || num1>0 && num3 > 0){
            return true;
        }return false;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(func1(num1 , num2 , num3));
    }
}
