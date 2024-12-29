package ClassPractice;



public class CharArray1 {
    public static boolean equalData (char[] arr1 , char [] arr2){
    int counter = 0;
    if (arr1.length != arr2.length){
        return false;
    }
    else {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                counter++;
            }

        }
        if (counter == arr2.length) {
            return true;
        } else {
            return false;
        }
    }
    }

    public static boolean contains (char [] arr , char toSearch){
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toSearch){
                result = true;
                break;
            }

        }
        return result;
    }

    public static int indexOf (char [] arr , char toFind){
        int find = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind){
                 find = i + 1;
                break;
            }

        }
        return find;
    }

    public static boolean hasDuplicates (char[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    return true;
                }

            }

        }
        return false;

    }

    public static char [] replace (char[] arr , char original , char replacement){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length ; j++) {
                if (arr[i] == original){
                    arr[i] = replacement;
                }

            }

        }
        return arr;
    }


    public static void main(String[] args) {
        char [] arr1 = {'Y' , 'A' , 'B' , 'R', 'i'};
        char [] arr2 = {'Y' , 'A' , 'I' , 'R'};
        System.out.println(equalData(arr1 , arr2));;
        char toSearch = 'B';
        char [] arr = {'S' , 'I' , 'B' , 'O' , 'N' , 'I'};
        System.out.println(contains(arr , toSearch));
        char toFind = 'N';
        System.out.println(indexOf(arr , toFind));
        System.out.println(hasDuplicates(arr));
        char original = 'I';
        char replacement = 'Y';
        replace (arr ,original , replacement);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr [i] + " ");

        }
    }
}
