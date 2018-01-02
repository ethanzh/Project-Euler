public class problem2 {


    public static void main(String[] args){

        System.out.println(run(0, 0));


    }

    static int run(int iter, int total){

        if(even(iter) && under4mil(iter)){
            total += fib_generator(iter);
            run(iter + 1, total);
        }

        else if(!even(iter)){
            run(iter + 1, total);
        }

        else if(!under4mil(iter)){
            return total;
        }
        return total;
    }

    static boolean even(int n){

        return fib_generator(n) % 2 == 0;

    }

    static boolean under4mil(int n){

        return fib_generator(n) < 4000000;

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
