public class IncOrder {
 
    public static void printinc(int n){
       if(n==0){
        return ;
       }
       printinc(n-1);
       System.out.print(n+" ");
    }
    public static void main(String arg[]){
        int n=10;
        printinc(n);
    }
}

