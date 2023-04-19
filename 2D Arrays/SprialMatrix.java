import java.util.*;
public class SprialMatrix{
    public static void printarr(int matrix[][]){
        int startrow=0;
        int endrow=3;
        int startcol=0;
        int endcol=3;
        while(startrow<=endrow && startcol<=endcol){ 
        
            //TOP

        for(int j=startcol;j<endcol;j++){
            System.out.print(matrix[startrow][j]+" ");
        }
            // Right
    
          for(int i=startrow;i<endrow;i++){
            System.out.print(matrix[i][endcol]+" ");
        }
            //Buttom

              for(int j=endcol;j>startcol;j--){
              /*   if(startrow==endrow){   // these are use when odd number of rows and column
                    break;
                } */
            System.out.print(matrix[endrow][j]+" ");
        }
            //Left

              for(int i=endrow;i>startrow;i--){
               /*  if(startcol==endcol){
                    break;
                } */
            System.out.print(matrix[i][startcol]+" ");
        }

        startcol++;
        startrow++;
        endcol--;
        endrow--;
    }
    System.out.println("");
    } 
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},
            {9,10,11,12},{13,14,15,16}};

            printarr(matrix);
    }
}