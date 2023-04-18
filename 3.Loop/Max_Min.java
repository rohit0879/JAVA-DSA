import java.util.*;
public class Max_Min {
    public static void main(String args[]){
        int Min = Integer.MAX_VALUE;
        int Max = Integer.MIN_VALUE;
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("enter your number : ");
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<10;i++){
             if(Max < arr[i] ){
                 Max = arr[i];
             }
             else if(Min > arr[i]){
                Min = arr[i];
             }
        }
        System.out.println("Maximum number is : "+Max);
        System.out.println("Minimum number is : "+Min);
    }
}
