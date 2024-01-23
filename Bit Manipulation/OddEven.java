public class OddEven {
    public static void odd_even(int n){
        int bitMax=1;
        if((n & bitMax )==0){
            System.out.print("EVEN");
        }
        else{
            System.out.print("ODD");
        }
    }
    public static void main(String args[]){
        int n=10;
        odd_even(n);
    }
}
