public class problem1 {

    public static void main(String[] args){

        int top = 1000;

        int total = 0;

        for(int i = 1; i < top; i++){

            if (divisible(i, 3) || divisible(i, 5)){
                total += i;
            }

        }

        System.out.println(total);

    }

    static boolean divisible(int number, int divisor){


        return number % divisor == 0; // Simplified version of printing whether condition is true or false
    }

}
