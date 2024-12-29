package Array;

import java.util.Scanner;

public class ArrayQ16 {
    public static boolean polindrom (int number){
        int [] array = new int [4];
        while (number != 0){
            for (int i = 0; i < array.length; i++) {
                array [i] = number % 10;
                number = number / 10;
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (array [i] != array[array.length -1 -i]){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a pilandromic number");
        int number = scanner.nextInt();
        System.out.println(polindrom(number));
    }
}
