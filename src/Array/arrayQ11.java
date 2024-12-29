package Array;

import java.util.Scanner;

public class arrayQ11 {
    public static int [] minusNum (int [] array , int num) {
        int counter = 0 ;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                counter ++;
            }

        }
        int [] newArray = new int[array.length - counter];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array [i] != num){
                newArray[index] = array[i];
                index ++;
            }

        }
        return newArray;
    }


    public static void main(String[] args) {
    int [] array = {5 , 7 ,5 ,3, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a num");
        int num = scanner.nextInt();
        int [] newArray = minusNum(array , num);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
        }
    }
}
