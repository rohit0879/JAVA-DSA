import java.util.Scanner;

public class Matrix {
    public static void Search(int matrix[][],int key){
        for(int i=1;i<=3;i++){ 
            for(int j=1;j<=3;j++){
                if(matrix[i][j]==key){
                    System.out.println("index is : ("+i+","+j+")");
                }
            }
        } 
    }

    public static void main(String args[]){
        //input

        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){ 
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
        System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int key=8;
        Search(matrix,key);
    }
}
