package Array;

import java.util.Scanner;

public class ArrayQ3 {
    public static float [] arraySize (int size , float value){
      float [] array = new float [size];
        for (int i = 0; i < array.length; i++) {
            array [i] = value;

        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size");
        int size = scanner.nextInt();
        System.out.println("enter a value");
        float value = scanner.nextFloat();
       float [] array =  arraySize(size , value);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + " ");

        }
    }
}
