package functions;

import java.util.Scanner;

public class funcsQ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highestNum = 0;
        int num = scanner.nextInt();
        while (num != 0){
            System.out.println("enter a number");
            int newNum= scanner.nextInt();
            if (newNum > num && newNum > highestNum){
                highestNum = newNum ;
                System.out.println("the highest num is " + highestNum);
            }
        }
    }
}
