public class Kadanes_Algorithem {
    public static void kadanes(int number[]){
        int CS=0;
        int MS=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            CS+=number[i];
            if(CS<0){
                CS=0;
            }
            MS=Math.max(CS,MS);
        }
        System.out.println("our MAX subarray Sum is :"+MS);
    }
    public static void main(String args[]){
        int number[]={-1,-3,4,-1,-2,1,5,-3};
        kadanes(number);
    }
}
