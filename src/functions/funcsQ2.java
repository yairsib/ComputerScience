package functions;

import java.util.Scanner;

public class funcsQ2 {
    public static boolean func1 (int num1 , int num2){
        if (num1 % num2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        System.out.println(func1(num1 , num2));
    }
}
