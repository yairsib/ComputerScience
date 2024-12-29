package functions;

import java.util.Scanner;

public class funcsQ11 {
    public static boolean is1Number (int num){
        if (num > 0 && num < 10){
            return true;
        }
        return false;
    }
    public  static boolean digitsInNum (int number , int digits){
        while (number != 0){
            if (number % 10 == digits){
                return true;

            }
            number = number / 10;
        }return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
      do {
          System.out.println("enter a number");
          number = scanner.nextInt();
      } while (!is1Number(number));
        int digits = scanner.nextInt();
        System.out.println(digitsInNum(digits , number));
    }
}
