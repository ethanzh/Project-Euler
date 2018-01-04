public class problem10 {


    public static void main(String[] args){

        int total = 0;

        for (int i = 2; i < 2000000; i++){

            if(prime(i)){
                //total += i;
            }

        }

        int number = 2;
        int newtotal = 0;

        while (number < 10){

            number++;

        }



       System.out.println(total);

    }

    static boolean prime(int number){

        for (int i = 2; i <= (number / 2); i++){

            if(number % i == 0){
                return false;
            }

        }

        return true;

    }


}
