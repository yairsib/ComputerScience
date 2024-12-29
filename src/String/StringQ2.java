package String;

import java.util.Scanner;

public class StringQ2 {

    public static String longestString (String str1 , String str2){
        if (str1.length()>str2.length()){
            return str1;
        }
        return str2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your 1st String");
        String str1 = scanner.nextLine();
        System.out.println("enter your 2nd String");
        String str2 = scanner.nextLine();
        System.out.println(longestString(str1 , str2));
    }
}
