import java.util.*;
public class Sorting {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
     
        list.add(4);
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(9);
        System.out.println(list);

        Collections.sort(list);
        System.out.println("Accending order : "+list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("decending order : "+list);

    }
}
