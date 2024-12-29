package PROJECTS;

import java.util.Random;
import java.util.Scanner;

public class Wordle_Project {

    public static boolean checkLetters ( String playerWord ){
        if (playerWord.length() != 5){
            return false;
        }
        return true;
    }

    public static String checkGuesses ( String theWord , String playerWord){
        String playerWordLower = playerWord.toLowerCase();
        String newString = "";
        for (int i = 0; i < theWord.length(); i++) {
            if (theWord.charAt(i) == playerWordLower.charAt(i)){
              newString += "G";
              continue;
            }
            String answer = "_";
            for (int j = 0; j < theWord.length(); j++) {
                if (playerWordLower.charAt(i) == theWord.charAt(j)){
                    answer = "Y";
                    break;
                }
            }
            newString += answer;
        }
        return newString;
    }

    public static void main(String[] args) {
    String [] words = {"apple" , "house" , "beach" , "table" , "chair" , "sweet" , "water" , "dance" , "movie" , "bread"};
      Random random = new Random();
      int index = random.nextInt(words.length);
      String theWord = words[index];
        System.out.println("Hello , Lets play!!! , Try to guess my word...");
        Scanner scanner = new Scanner(System.in);
        String playerWord = scanner.next();
        int turns = 6;
        String answer = "";
        while (turns != 0){
            if (checkLetters(playerWord)){
              answer = checkGuesses(theWord , playerWord);
                turns --;
                System.out.println(answer);
            }
            if (answer.equals("GGGGG")){
                System.out.println("you won!!!");
                break;
            } else {
                System.out.println("you've left " + turns + " turns ,try another word");
                playerWord = scanner.next();

            }

        }


    }
}
