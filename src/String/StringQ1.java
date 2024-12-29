package String;

import java.util.Scanner;

public class StringQ1 {

    public static String name (String firstN , String lastN){
        return firstN + " " +lastN;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your full name");
        String firstN = scanner.nextLine();
        String lastN = scanner.nextLine();
        System.out.println(name(firstN , lastN));
    }
}
