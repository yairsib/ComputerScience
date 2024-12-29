package String;

import java.util.Scanner;

public class StringQ5 {

    public static int counter (String text , char toCount) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == toCount) {
                counter++;

            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        char toCount = scanner.next().charAt(0);
        System.out.println(counter(text , toCount));
    }
}
