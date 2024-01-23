public class Power {
    public static int power(int x,int n){
        if(n == 0){
            return 1;
        }
        
        int pow= x*power(x,n-1);
        return pow;
    }
    public static void main(String args[]){
        // power of x^n
        int x=2;
        int n=5;
        System.out.print(power(x,n));
    }
}
