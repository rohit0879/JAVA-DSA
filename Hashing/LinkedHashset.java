import java.util.*;
public class LinkedHashset {
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
       
        System.out.println(city); // print in order
        city.remove("Noida");
        System.out.println(city);
        
    }
}
