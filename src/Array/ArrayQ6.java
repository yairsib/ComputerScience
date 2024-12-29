package Array;

public class ArrayQ6 {
    public static int sum (int [] array){
    int sum = array [0] + array[1] + array[2] + array[3];
    return sum;
    }

    public static void main(String[] args) {
    int [] array= {1 , 3 , 5 ,1};
    int sum = sum(array);
        System.out.println(sum);
    }
}
