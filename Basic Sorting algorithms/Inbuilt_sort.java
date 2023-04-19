import java.util.Arrays;
public class Inbuilt_sort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
          
        }
    }
    public  static void main(String args[]){ 
    int arr[]={5,2,4,1,3};
    //Arrays.sort(arr);
      Arrays.sort(arr,0,3);
    printarr(arr);
    
    }
}
