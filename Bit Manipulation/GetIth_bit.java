public class GetIth_bit {
    public static int get_bit(int n,int i){
        int bitMax=1<<i;
        if((n & bitMax )==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        
        System.out.print(get_bit(10,2));
    }
}
