package Array;

public class ArrayQ15 {
    public static boolean pilandromArray (int [] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int [] array = {12 , 56 , 56 , 12};
        System.out.println(pilandromArray(array));
    }
}
