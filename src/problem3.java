import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.toIntExact;

public class problem3 {

    public static void main(String[] args){

        primeFactors(600851475143L);


    }


    static void primeFactors(long number){

        List<Integer> factorList = new ArrayList<Integer>();

        while (number > 1){

            long divided = checker(number, 2);

            factorList.add(toIntExact(number / divided));

            number = divided;

        }

        System.out.println(factorList);


    }

    static long checker(long number, int divisor){

        if (checkPrimeFactor(number, divisor)){
            return number / divisor;
        } else{
            return checker(number, divisor + 1);
        }
    }


    static boolean checkPrimeFactor(long number, int divisor){

        if (number % divisor == 0 && prime(divisor)){
            return true;
        } else{
            return false;
        }
    }

    static int largestPrimeFactor(int number){

        int largestPossible;
        int largestPrimeSoFar = 0;

        if (number % 2 == 0){
            largestPossible = number / 2;
        } else {
            largestPossible = (number + 1) / 2;
        }

        for (int i = 1; i <= largestPossible; i++){

            if (number % i == 0 && prime(i)){
                largestPrimeSoFar = i;
            }
        }

        return largestPrimeSoFar;

    }

    static boolean prime(int number){

        switch (number){

            case 1:
                return false;
            case 2:
                return true;
            case 3:
                return true;
            case 5:
                return true;
            case 7:
                return true;
        }

        if(     number % 2 == 0 ||
                number % 3 == 0 ||
                number % 5 == 0 ||
                number % 7 == 0 ){
            return false;
        } else{
            return true;
        }
    }


}
