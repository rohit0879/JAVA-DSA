import java.util.Arrays;
import java.util.Collections;
public class Inbult{ 
    public static void printarr(Integer arr[]){
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
      }
    }
   public static void main(String args[]){
    Integer arr[]={3,6,2,1,8,7,4,5,3,1};
    Arrays.sort(arr,Collections.reverseOrder());
    printarr(arr);
   }
}
