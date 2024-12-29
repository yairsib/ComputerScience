package ClassPractice;

import java.util.Scanner;

public class Array1 {
    public static void printArray (int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

    }

    public static void initArray (int [] array){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length ; i++) {
            array[i] = scanner.nextInt();
        }

    }

    public static void reverseArray (int [] array){
        int [] array2 = new int[array.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array [i];

        }
        int index = 0;
        for (int i = array.length - 1; i >= 0 ; i--) {
            array [i] = array2 [index];
            index++;

        }
    }

    public static void main(String[] args) {
        int [] array = new int[5];
        initArray(array);
        reverseArray(array);
        printArray(array);

    }
}
