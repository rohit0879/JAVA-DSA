public class DiagonalSum {
    public static void Diagonal(int matrix[][]){
        int sum=0,sumSD=0;
        for(int i=0;i<matrix.length;i++){
        sum+=matrix[i][i];
        }
        System.out.println("sum of PD : "+sum);
        for(int i=0;i<matrix.length;i++){
            sumSD+=matrix[i][matrix.length-1-i];
            }
            System.out.print("sum of SD : "+sumSD);
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        Diagonal(matrix);
    }
}
