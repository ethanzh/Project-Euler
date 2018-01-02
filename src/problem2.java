public class problem2 {


    public static void main(String[] args){

        int max = 4000000;

        int topvalue = getTopValue(max);
        System.out.println(topvalue);

        int total = 0;

        for(int i = 0; i < topvalue; i++){

            int currentvalue = fib_generator(i);
            //System.out.println(currentvalue);

            if(currentvalue % 2 == 0){
                //System.out.println("Even: " + currentvalue);
                total += currentvalue;
            }

        }

        System.out.println(total);
    }

    static int getTopValue(int value){

        int n = -1;

        while (fib_generator(n) <= value){
            n++;
        }

        return n;

    }

    static int fib_generator(int n){

        int a = 0;
        int b = 1;
        int c = 0; // c = total

        for (int i = -1; i < n; i++){
            c = a + b;
            a = b;
            b = c;

        }

        return c;
    }


}
