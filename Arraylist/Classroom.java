import java.util.*;
public class Classroom{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // Get elements

        int element=list.get(0);
        System.out.println(element);

        //delete
        list.remove(2);
        System.out.println(list);

        // set
       //  list.set(2,10);
       // System.out.println(list);

        // contain
        System.out.println(list.contains(1));
        System.out.println(list.contains(11)); 
        System.out.println(list.size());

        // Reverse
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");


         
        }

    }
}