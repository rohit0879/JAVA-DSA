public class ClearIth {
    public static int clear_bit(int n,int i){
        int bitMax=~(1<<i);
        return (n & bitMax) ; 
    }
    public static void main(String args[]){
        
        System.out.print(clear_bit(10,1));
    }
}
