public class Fibonacci {
    public static int fab(int n){
        if(n==0 || n==1){
         return n ;
        }
       
        int fib = fab(n-1)+fab(n-2);
        return fib;
     }
     public static void main(String arg[]){
         int n=25;
        System.out.println(fab(n));
     }
}
