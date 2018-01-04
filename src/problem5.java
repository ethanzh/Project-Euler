public class problem5 {



    public static void main(String[] args){

        int startingNumber = 2520;

        while(!evenlyDivisibleOneToX(startingNumber, 20)){

            startingNumber++;


        }

        System.out.print(startingNumber);


    }



    static boolean evenlyDivisibleOneToX(int number, int x){

        for(int i = 1; i <= x; i++){

            if (number % i != 0){
                return false;
            }
        }

        return true;

    }


}
