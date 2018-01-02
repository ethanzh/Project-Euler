public class problem4 {


    public static void main(String[] args){


        palindrome(12345);



    }


    static boolean palindrome(int number){

        int length = String.valueOf(number).length() - 1;
        int[] reversed = new int[length + 1];

        String numberstring = String.valueOf(number);

        for (int i = 0; i <= length; i++){

            //reversed[length - (i * 1)] = numberstring.charAt(i);

        }



        reversed[4] = numberstring.charAt(0);
        System.out.println(reversed[4]);
        reversed[3] = numberstring.charAt(1);
        reversed[2] = numberstring.charAt(2);
        reversed[1] = numberstring.charAt(3);
        reversed[0] = numberstring.charAt(4);

        for (int j = 0; j <= length; j++){
            System.out.println(reversed[j]);
        }


        return false;
    }



}
