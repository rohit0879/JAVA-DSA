public class TilingPlm {
    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        // vertical
        int fnm1= 4 * (n-1);
        // horijontal
        int fnm2 = 4 * (n-4);
        int totalway = fnm1 + fnm2 ;
        return totalway;
    }
    public static void main(String args[]){
        int n=4;
        System.out.print(tiling(n));
    }
}
