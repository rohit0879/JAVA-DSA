public class Missing_number {
    public static void main(String args[]){
        int arr[] = {1,2,4,5,6,7,9,10,13,14,15};
        int n= 15;
        int count =1;
        for(int i=0;i<n;i++){
          if(arr[i] != count){
             System.out.print(count+" , ");
             i--;
          }
          count++;
        }
    }
}
