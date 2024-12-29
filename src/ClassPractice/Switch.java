package ClassPractice;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the time");
        int time = scanner.nextInt();
        int timeLeft = 20 - time;
        switch (time){
            case 10 -> System.out.println("yove left 10");
            case 11 -> System.out.println("youve left 9");
            case 12 -> System.out.println("youve left 8");
            case 13 -> System.out.println("youve left 7");
            case 14 -> System.out.println("youve left 6");
            case 15 -> System.out.println("youve left 5");
            case 16 -> System.out.println("youve left 4");
            case 17 -> System.out.println("youve left 3");
            case 18 -> System.out.println("youve left 2");
            case 19 -> System.out.println("youve left 1");
            default -> System.out.println("the safari is close");




        }
    }
}
