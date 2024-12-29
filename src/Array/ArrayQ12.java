package Array;

import java.util.Random;
import java.util.Scanner;

public class ArrayQ12 {
    public static int [] size (int size){
        int [] array = new int [size];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            int rndNum = random.nextInt(size * 10);
            array [i] = rndNum;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " , ");

        }
        return array;

    }
    public static void newArray (int [] array){
        int highestNum= 0;
        int bigcounter=0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            for (int j = 0; j < array.length; j++) {
                int counter=0;
              if (num == array [j]){
                 counter ++;

              }


            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size");
        int size = scanner.nextInt();
        int [] array = size(size);
        newArray(array);
        }
    }


