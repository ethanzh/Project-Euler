public class problem10 {


    public static void main(String[] args){

        long total = 0;

        for (long i = 2; i < 2000000; i++){

            if(prime(i)){
                total += i;

                System.out.println("Current: " + i + "\nTotal: " + total);

            }

        }

       System.out.println(total);

    }

    static boolean prime(long number){

        for (long i = 2; i <= (number / 2); i++){

            if(number % i == 0){
                return false;
            }

        }

        return true;

    }


}
