public class number10 {
    public static void main(String[] args){
        System.out.println(running());
    }
    public static int running(){  
        int total = 0;
        for(int i = 2; i < 2000000; i++){
            if(primeChecker(i)){
                total += i;
            }
         }
        return total;
    }
    public static boolean primeChecker(int n){
        for(int i=2;i<n;i++) {
        if(n%i==0)
            return false;
    }
    return true;
    }
}
