package ClassPractice;

import java.util.Scanner;

public class DoWhileE2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;
        int num;

        do {
            System.out.println("enter");
            num = scanner.nextInt();
        }while (num > 0);
        System.out.println(num);


        }
    }

