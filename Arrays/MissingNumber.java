
public class MissingNumber {
    public static void miss(int arr[],int n){
        int j=1;
        for(int i=0;i<=n+2;i++){
            if(arr[i] != j){ 
                System.out.print(j+" ");
                i--;
            }
            j++;
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,4,5,7,8,10};
        int n=arr.length;
        miss(arr,n);
    }
}
