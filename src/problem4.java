import java.lang.reflect.Array;
import java.util.Arrays;

public class problem4 {


    public static void main(String[] args){




    }


    static boolean palindrome(int number){

        int length = String.valueOf(number).length();

        String numberstring = String.valueOf(number);

        String[] reversed = new String[length];

        for(int i = 0; i < length; i++){

            reversed[(length - 1) - i] = String.valueOf(numberstring.charAt(i));

        }

        String reversedstring = String.join("", reversed);

        int reversedint = Integer.valueOf(reversedstring);

        return number == reversedint;
    }



}
