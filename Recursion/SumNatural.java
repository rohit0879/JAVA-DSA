public class SumNatural {
    public static int SumN(int n){
        if(n==1){
         return 1 ;
        }
       
        int sum=n+SumN(n-1);
        return sum;
     }
     public static void main(String arg[]){
         int n=5;
         System.out.println(SumN(n));
     }
}
