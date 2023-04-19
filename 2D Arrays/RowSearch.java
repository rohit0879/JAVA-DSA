// TC = nlogn

public class RowSearch {
    public static boolean rowSearch(int mtx[][],int key){
        int row=0 ,col=mtx[0].length-1;
        while(row<mtx.length && col>=0){

            if(mtx[row][col]==key){
                System.out.println("("+row+","+col+")");
                return true;
            }

            else if(mtx[row][col] > key){
                col--;

            }
            else{
                row++;
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String args[]){
        int mtx[][]={{10,20,30,40},{15,25,35,36},{38,40,45,50},{51,52,53,54}};
        int key=52;
        rowSearch(mtx,key);
    }
}
