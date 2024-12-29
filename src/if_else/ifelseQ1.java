package if_else;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ifelseQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number");
        int number = scanner.nextInt();

        if (number > 1000) {
            System.out.println("success");

        } else {
            System.out.println("fail");


        }
    }
}