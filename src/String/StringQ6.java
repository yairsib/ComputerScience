package String;

import java.util.Scanner;

public class StringQ6 {

    public static boolean stringEquals (String str1 , String str2){
        for (int i = 0; i <str1.length() ; i++) {
            if (str1.charAt(i) != str2.charAt(i)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st string");
        String str1 = scanner.next();
        System.out.println("enter 2nd string");
        String str2 = scanner.next();
        System.out.println(stringEquals(str1 , str2));
    }
}
