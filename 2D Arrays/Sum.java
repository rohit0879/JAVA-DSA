import java.util.*;
public class Sum{
    public static void SumMatrix(int matrix[][]){
        int sum=0;
        for(int i=0;i<=matrix.length-1;i++){
            for(int j=0;j<=matrix[0].length-1;j++){
              sum+=matrix[i][j];  
            }
        }
        System.out.print(sum);
    }
    public static void main(String args[]){
    int matrix[][]={{1,4,9},{11,4,3},{2,2,3}};
    SumMatrix(matrix);
    }
}