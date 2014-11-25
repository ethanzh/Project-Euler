public class number5 {
    
    public static void main(String[] args){
        running();
        
    }
    public static void running(){
        System.out.println(looper());
    }
    public static int looper(){
        int counter = 2521;
        outerloop:
        while(true){
            if(counter % 1 == 0 &&
               counter % 2 == 0 &&
               counter % 3 == 0 &&
               counter % 4 == 0 &&
               counter % 5 == 0 &&
               counter % 6 == 0 &&
               counter % 7 == 0 &&
               counter % 8 == 0 &&
               counter % 9 == 0 &&
               counter % 10 == 0 &&
               counter % 11== 0 &&
               counter % 12 == 0 &&
               counter % 13 == 0 &&
               counter % 14 == 0 &&
               counter % 15 == 0 &&
               counter % 16 == 0 &&
               counter % 17 == 0 &&
               counter % 18 == 0 &&
               counter % 19 == 0 &&
               counter % 20 == 0){
                break outerloop;
            } else{
                counter++;
            }
        }
        return counter;
    }
}