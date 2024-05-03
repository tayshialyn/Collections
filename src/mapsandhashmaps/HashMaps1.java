package mapsandhashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps1 {

    public static void main(String[] args) {

        // Maps must be made up of a set of key value pair
        Map<Integer, String> map = new HashMap<Integer, String>();    // HashMaps do not support primitive data types

        // To populate data within HashMaps, use the put method (set() method does not exist in Maps or HashMaps)
        map.put(1, "Raymond");
        map.put(2, "Jason");
        map.put(3, "Sammie");
        map.put(4, "Theresa");

        // To traverse or iterate through the map, we use a for loop to do so
        // starting with creating a map entrySet()
        Set set = map.entrySet();
        Iterator iterations = set.iterator();

        // Using iterations to iterate through the hashmap

        // Solution 1: through each iteration, we obtain and print out the key:value pair found in the Hashmap called "map"
//        while (iterations.hasNext()) {
//            Map.Entry entry = (Map.Entry)iterations.next();
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        // Solution 2: FOR EACH LOOP to iterate through a HashMap (easier to use)
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
