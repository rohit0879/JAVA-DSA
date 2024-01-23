public class Optmise {
    public static int opt(int x,int n){
        if(n==0){
            return 1;       }

        int pow= opt(x,n/2);
        int halfPow= pow * pow ;
        if(x % 2 != 0){
          halfPow = x * halfPow;
        }
        return halfPow ;
    }
    public static void main(String args[]){
        // x^n
        int x = 2;
        int n = 5;
        System.out.print(opt(x,n));
    }
}
