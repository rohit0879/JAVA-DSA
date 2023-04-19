import java.util.Collections;

public class ReverseOrder {
  
    public static void printarr(Integer arr[]){
        for(Integer i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
          
        }
    }
    public  static void main(String args[]){ 
    Integer arr[]={5,2,4,1,3};  // int not worke int Reverse order
    Arrays.sort(arr,Collections.reverseOrder());
    printarr(arr);
    
    }
}

