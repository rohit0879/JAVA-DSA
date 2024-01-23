import java.util.*;
public class IteratorSet {
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("patna");
        cities.add("delhi");
        cities.add("noida");
        cities.add("bengaluru");

        // Using Iterator

        Iterator it = cities.iterator();
        while(it.hasNext()){
           System.out.println(it.next()); 
        }

        System.out.println("===========================================================");
        // Advance for loop

        for(String city : cities){
            System.out.println(city);
        }
    }
}
