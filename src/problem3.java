public class problem3 {

    public static void main(String[] args){



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
