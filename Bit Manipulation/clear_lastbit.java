public class clear_lastbit {
    public static int clear_bit(int n,int i){
        int bitMax=(~0)<<i;
        return (n & bitMax); 
    }
    public static void main(String args[]){
        
        System.out.print(clear_bit(15,3));
    }
}
