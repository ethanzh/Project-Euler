public class number4 { // Defines class
    public static void main(String[] args) { // Main
        running();
   }
    public static void running(){ // Actual program that is running
       int myInt = multiplier();
       int reversed = reverse(myInt);
       System.out.println(myInt);
   }
   public static int multiplier(){ // Starts with 999 x 999, works down systematiclly
                                   // Incorporated checking method into the for loops
       int highest = 0;
       for(int num1 = 999; num1 > 100; num1--){
           for(int num2 = 999; num2 > 100; num2--){
               int multiplied;
               multiplied = num1 * num2;
               if(multiplied == reverse(multiplied)){
                    if(multiplied > highest){
                        highest = multiplied;
                    }
                    break;
               }
           }   
       }   
       return highest;
   }
   public static int reverse(int n) { // Gotten from internet, reverses an int
       int result = 0;
       int rem;
       while (n > 0) {
           rem = n % 10;
           n = n / 10;
           result = result * 10 + rem;
       }
       return result;
   }   
}
