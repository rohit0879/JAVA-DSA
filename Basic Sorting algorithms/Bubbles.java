import java.util.*;
public class Bubbles{
    public static void bubbles(int arr[]){
        int n =arr.length;
        for(int turn=0;turn<n;turn++){
            for(int j=1;j<n;j++){
                while(arr[j]>arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    public static void printarr(int arr[]){
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
       } 
    }    
 
   public static void main(String args[]){
      int arr[]={3,6,2,1,8,7,4,5,3,1};
      bubbles(arr);
      printarr(arr);
   }

}