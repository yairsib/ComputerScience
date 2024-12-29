package Array;

import java.util.Scanner;

public class ArrayQ5 {
    public static int [] arrayNum (int num1 , int num2){
    int [] array = new int [num1];
        for (int i = 0; i < array.length; i++) {
            array [i] = num2;
            num2 ++;

        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a size");
        int num1 = scanner.nextInt();
        System.out.println("enter your number");
        int num2 = scanner.nextInt();
        int [] array = arrayNum(num1 , num2);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + " ");

        }
    }
}
