public class problem6 {

    public static void main(String[] args){

        System.out.println(Math.abs(sumOfSquares(100) - squareofSums(100)));


    }


    static int sumOfSquares(int upto){

        int total = 0;

        for (int i = 1; i <= upto; i++){

            total += (i * i);

        }

        return total;

    }


    static int squareofSums(int upto){

        int total = 0;

        for (int i = 1; i <= upto; i++){

            total += i;

        }

        return (total * total);

    }



}
