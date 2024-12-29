package Array;

import java.util.Random;
import java.util.Scanner;

public class ArrayQ9 {
    public static int allNums (int size){
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            int rndNum = random.nextInt(100);
            array[i] = rndNum;
            System.out.print(array[i] + " ");
        }
        int highestNum = array [0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > highestNum){
                highestNum = array[i];
            }

        }
        return highestNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int highestNum= allNums(size);
        System.out.println("the highest num is "+ highestNum);
    }
}
