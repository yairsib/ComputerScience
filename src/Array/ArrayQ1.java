package Array;

import java.sql.Array;

public class ArrayQ1 {
    public static void main(String[] args) {
        int [] array = {4,7 , 8};
        printArray(array);

    }
    public static int [] printArray (int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + " ");

        }
        return array;
    }
}
