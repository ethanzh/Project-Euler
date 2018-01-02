public class problem2 {


    public static void main(String[] args){

        int iter = 0;
        int total = 0;

        while (true){

            if(fib_generator(iter) < 4000000 && fib_generator(iter) % 2 == 0){
                total += fib_generator(iter);
            } else if(fib_generator(iter) >= 4000000){
                break;
            }

        }

        System.out.println(total);

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
