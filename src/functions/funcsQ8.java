package functions;

import java.util.Scanner;

public class funcsQ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 4 nums");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();
        int num4= scanner.nextInt();
        System.out.println(avg(num1 , num2 , num3 , num4));
    }
    public static boolean avg (int num1 , int num2, int num3, int num4){
        float average = (num1 + num2 + num3 + num4)/4f;
        if (average == num1 || average == num2 || average == num3 || average == num4){
            return true;
        }
        return false;
    }
}
