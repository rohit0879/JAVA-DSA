
import java.util.*;
public class LinearSearch {
    public static void main(String args[]){

        int mtx[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int key=10;

        for(int i=0;i<=mtx.length-1;i++){

            for(int j=0;j<=mtx[0].length-1;j++){

                if(mtx[i][j]==key){
                    System.out.print("("+i+","+j+")");
                }
            }
              System.out.println(" ");
        }
    }
}
