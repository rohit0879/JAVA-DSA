import java.util.*;
public class Selection{

    public static void select(int arr[]){
        int n=arr.length;
        for(int term=0;term<n;term++){
           for(int j=1;j<=n-1-term;j++){
              if(arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
              }
           }
        }
    }
    public static void Printarr(int arr[]){
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2,};
        select(arr);
        Printarr(arr);
    }
}
