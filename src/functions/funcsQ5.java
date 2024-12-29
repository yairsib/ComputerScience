package functions;

import java.util.Scanner;

public class funcsQ5 {
    public static int highest (int number){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a numbers");
        int highestNum = scanner.nextInt();
        for (int i = 0; i < number-1; i++) {
            int num = scanner.nextInt();
            if (num > highestNum){
                highestNum = num;
            }
            }
        return highestNum;
        }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int dsfd = sc.nextInt();
        highest(dsfd);
    }
    }

