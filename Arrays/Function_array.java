import java.util.*;
public class Function_array{
    public static void update(int marks[],int nonChangable){
        nonChangable= 10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+2;
        }
    }
    public static void main(String args[]){
        int marks[]={96,97,98};
        int nonChangable=5;
        update(marks, nonChangable);
        System.out.println(nonChangable);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println();
    }
}