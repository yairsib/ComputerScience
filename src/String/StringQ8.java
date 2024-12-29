package String;

public class StringQ8 {

    public static String phoneNum (String number){
        if (number.length() == 10){
            if (number.charAt(3) != '-'){
                return number.substring(0,3) + '-' + number.substring(3);
            }
        } else if (number.length()==11) {
            if (number.charAt(3) == '-'){
                return number;
            }

        } else if (number.length()==12) {
            if (number.startsWith("972")){
                return 0 + number.substring(3);
            }

        }
        return " ";
    }

    public static void main(String[] args) {
        String number = "972509318325";
        System.out.println(phoneNum(number));

    }
}
