package Array;

import java.util.Random;
import java.util.Scanner;

public class ArrayQ4 {
    public static int [] numberArray (int number){
    int [] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            int rndNum = random.nextInt(number);
            array[i] = rndNum;

        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scanner.nextInt();
       int []array = numberArray(number);

        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");

        }

    }
}
