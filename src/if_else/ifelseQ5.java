package if_else;

import java.util.Scanner;

public class ifelseQ5 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();

    if ( age < 18) {
        System.out.println("Teen");

    }else if (age > 65) {
        System.out.println("Pensioner");

    } else {
        System.out.println("Adult");
    }



}




}