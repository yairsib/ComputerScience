package PROJECTS;

import java.util.Scanner;

public class ID_Project {

    public static int [] numberOfDigits (int ID , int []array ){
        if (ID > 0){
        for (int i = array.length - 1 ; i >= 0 ; i--) {
            array[i] = ID % 10;
            ID = ID/10;

        }}
        else {
            System.out.print("This ID is not valid: ");
        }
    return array;
    }

    public static boolean verification (int [] arrayID , int [] firstVerification){
        int [] array1212 = {1 , 2 , 1 , 2 , 1 , 2 , 1 , 2 , 1};
        int sum = 0;
        int result = 0;
        for (int i = 0; i < arrayID.length; i++) {
             firstVerification [i] = array1212 [i] * arrayID [i];
        }
        for (int i = 0; i < firstVerification.length ; i++) {
            if (firstVerification[i] > 9){
                firstVerification[i] = firstVerification[i] % 10 + firstVerification[i]/10;
            }

        }

        for (int i = 0; i <= 7; i=i+2) {
           sum = firstVerification[i] + firstVerification[i + 1];
           result = result + sum;
        }
        result = result + firstVerification [8];

        if (result % 10 == 0){
            return true;
        }
        return false;
    }
    public static String checkDigit (int [] verification){
        int sum = 0;
        int result = 0;
        int [] newArray = new int[8];
        for (int i = verification.length - 2; i >= 0 ; i--) {
            newArray[i] = verification[i];
        }
        for (int i = 0; i < 7; i=i+2) {
            sum = newArray[i] + newArray[i +1];
            result = result + sum;
        }
        int checkNumber = 10 - result%10;
        return "The check number is: " + checkNumber;



    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your ID");
        int ID = scanner.nextInt();
        int [] arrayID = new int[9];
        int [] verification = new int[9];
        numberOfDigits(ID , arrayID);
        for (int i = 0; i < arrayID.length; i++) {
            System.out.print(arrayID [i]);
        }
        System.out.println();
        System.out.println(verification(arrayID , verification));
        if (verification(arrayID , verification) == true){
            System.out.println(checkDigit(verification));
        }

    }
}
