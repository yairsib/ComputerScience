package if_else;

import java.util.Random;
import java.util.Scanner;

public class ifelseQ15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("enter the distance");
        int distance = scanner.nextInt();
        System.out.println("how much the plane can take?");
        int plane_cap = scanner.nextInt();
        System.out.println("how much people in the plane");
        int people = scanner.nextInt();
        int weather = random.nextInt(2);
        String stormy = (weather == 1)? "stormy": "summer";
        int sum;

        if (distance > 200) {
            distance -= 200;
            sum = (int) (distance * 1.2 + 350);
        }else if(distance > 100) {
            distance -= 100;
            sum = (int) (distance * 1.5 + 200);
        } else {
            sum = (int) (distance * 2);
        }
        if (plane_cap == people) {
            sum = (int) (sum * 0.9);
        }else if (plane_cap * 0.9 < people){
            sum = (int) (sum * 0.95);
        }
        if (weather == 1){
            sum *= 2;
        }
        System.out.println("the price of your ticket is " + sum);
        }



    }

