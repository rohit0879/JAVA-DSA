import java.util.*;
public class Bubbles_sort{

    public static void bubble(int arr[]){
        int n=arr.length;
        for(int term=0;term<n;term++){
           for(int j=0;j<=n-2-term;j++){
              if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
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
        int arr[]={1,4,5,3,7,6,2};
        bubble(arr);
        Printarr(arr);
    }
}