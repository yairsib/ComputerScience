package functions;

import java.util.Random;
import java.util.Scanner;

public class funcsQ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
    int number = scanner.nextInt();
    randomNumber(number);

    }
    public static void randomNumber (int number){
    int counter = 0;
    Random random = new Random();
    while (number > counter){
        int ranNum = random.nextInt(100);
        if (ranNum % number == 0){
            counter ++;
            System.out.println(ranNum);
        }
    }
}}
