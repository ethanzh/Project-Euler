public class problem2 {


    public static void main(String[] args){

        for(int i = 0; i < 10; i++){
            System.out.println(fib_generator(i));
        }

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
