import java.util.*;
public class Treeset {
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("Patna");
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Bengaluru");
       
        System.out.println(cities);


        LinkedHashSet<String> city = new LinkedHashSet<>();
        city.add("Patna");
        city.add("Delhi");
        city.add("Noida");
        city.add("Bengaluru");
       
        System.out.println(city); 
        

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Patna");
        ts.add("Delhi");
        ts.add("Noida");
        ts.add("Bengaluru");
       
        System.out.println(ts); // print in accending order
        ts.remove("Noida");
        System.out.println(ts);
        
    }
}
