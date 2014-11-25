public class number6 {
    public static void main(String[] args){
        running();
    }
    public static void running(){
        int finalNum = squareOfSum() - sumOfSquares();
        System.out.println(finalNum);
    }
    public static int sumOfSquares(){
        int total = 0;
        for(int i = 1; i <= 100; i++){
            total += Math.pow(i, 2);
        }
        
        return total;
    }
    public static int squareOfSum(){
        int total = 0;
        for(int i = 1; i <= 100; i++){
            total += i;
        }
        total = total * total;
        return total;
    }
}