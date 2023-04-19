import java.util.Arrays;
public class Inbult {
    public static void inbult(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    }
    public static void main(String args[]){
        int num[]={5,2,4,1,3};
        Arrays.sort(num);  //Arrays.sort(num,0,3);
      
         inbult(num);
    }
}
