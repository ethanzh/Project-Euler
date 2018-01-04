public class problem7 {

    public static void main(String[] args){

        int i = 1;
        int currentNumber = 2;

        while (i <= 10001){

            if (prime(currentNumber)){

                System.out.println("Prime #" + i + ": " + currentNumber);

                if (i == 10001){
                    System.out.println(currentNumber);
                    break;
                } else{
                    i++;
                    currentNumber++;
                }

            }else{
                currentNumber++;
            }



        }

        System.out.println(prime(7));

    }


    static boolean prime(int number){

        for(int i = 2; i <= (number / 2); i++){

            if (number % i == 0){
                return false;

            }
        }
        return true;

    }


}
