package String;

import java.util.Scanner;

public class StringQ3 {

    public static boolean checkLength (int num , String str){
        if (num == str.length()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();
        System.out.println("enter your String");
        String str = scanner.next();

        System.out.println(checkLength(num , str));

    }
}
