public class problem9 {


    public static void main(String[] args){

        double a;
        double b;
        double c;

        for (int i = 1; i <= 1000; i++){

            for (int j = 1; j <= 1000; j++){

                a = i;
                b = j;

                c = Math.sqrt((a * a) + (b * b));

                if ((a + b + c) == 1000 && pythagoreanPair(a, b, c)){
                    System.out.println("a: " + a + "\nb: " + b + "\nc: " + c);

                    int first = (int) a;
                    int second = (int) b;
                    int third = (int) c;

                    System.out.print(first * second * third);
                    break;
                }


            }
        }


    }



    static boolean pythagoreanPair(double a, double b, double c){


        return ((a * a) + (b * b) == (c * c));

    }


}
