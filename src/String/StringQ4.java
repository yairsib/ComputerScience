package String;

import java.util.Scanner;

public class StringQ4 {

    public static int checkStr (String str1 , String str2){
        if (str1.equals(str2)){
            return 1;
        } else if (str1.charAt(0) == str2.charAt(0)) {
            return 2;

        }
        else {
            return 3;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a String");
        String str1 = scanner.next();
        System.out.println("enter another String");
        String str2 = scanner.next();
        System.out.println(checkStr(str1 , str2));
    }
}
