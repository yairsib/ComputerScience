package Array;

import java.util.Scanner;

public class ArrayQ10 {
    public static int numsOfNum (int [] array , int num){
        int counter = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] == num) {
                counter++;
            }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a num");
        int num = scanner.nextInt();
        int [] array = {2, 5 , 2 , 2 , 2 , 4 , 3};
        System.out.println(numsOfNum(array , num));


    }
}
