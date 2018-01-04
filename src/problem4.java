import java.lang.reflect.Array;
import java.util.Arrays;

public class problem4 {


    public static void main(String[] args){

        findLargest();



    }


    static int findLargest(){

        int highestSoFar = 0;

        for(int i = 100; i <= 999; i++){

            for(int j = 100; j <= 999; j++){

                if(((i * j) > highestSoFar) && palindrome(i * j)){
                    highestSoFar = (i * j);
                }

            }
        }

        System.out.println(highestSoFar);

        return 0;
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
