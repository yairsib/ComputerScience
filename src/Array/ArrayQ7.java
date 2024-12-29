package Array;

public class ArrayQ7 {
    public static void highestNum (int [] array){
        int highestNum = array [0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > highestNum){
                highestNum = array[i];
            }

        }
        System.out.println("the highesr num is " + highestNum);
    }

    public static void main(String[] args) {
    int [] array = {4 , 5 , 8 ,77 ,3};
   highestNum(array) ;

    }
}
