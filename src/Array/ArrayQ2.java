package Array;

import java.util.Scanner;

public class ArrayQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int size = scanner.nextInt();
        int[] arr= arraySize(size);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int [] arraySize (int size){
        int [] array = new int[size];

        return array;

        }
    }


