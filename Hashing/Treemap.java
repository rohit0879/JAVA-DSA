import java.util.*;
public class Treemap{
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();
     
        // put() =>  O(1)   
        hm.put("india",100);
        hm.put("pakistan",50);
        hm.put("china",120);
        hm.put("nepal",30);

        TreeMap<String,Integer> tm = new TreeMap<>(); // it is sorted
     
        // put() =>  O(1)   
        tm.put("india",100);
        tm.put("pakistan",50);
        tm.put("china",120);
        tm.put("nepal",30);

        System.out.println(hm);
        System.out.println(tm);

       

    }
}