package String;

import java.util.Scanner;

public class StringQ7 {

    public static String longestString (String [] strings){
        String longestString = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > longestString.length()){
                longestString = strings[i];
            }

        }
        return longestString;
    }

    public static void main(String[] args) {
        String [] strings = {"yair" , "siboni" , "the" , "king"};
        System.out.println(longestString(strings));
    }
}
