public class Odd_Even {
    public void oddeven(int arr[],int n){
        int even[]=new int[n];
        int odd[]=new int[n];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even[j]=arr[i];
                j++;
            }
           
            if(arr[i]%2!=0){
                odd[k]=arr[i];
                k++;
            }
        }
        System.out.print("even : ");
        for(int i=0;i<j;i++)
            System.out.print(even[i]+" ");
        System.out.println();
        System.out.print("odd : ");
        for(int i=0;i<k;i++)
            System.out.print(odd[i]+" ");


    }
   public static void  main(String args[]) {
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    int n =arr.length;
    Odd_Even obj = new Odd_Even();
    obj.oddeven(arr,n);
   }   
}