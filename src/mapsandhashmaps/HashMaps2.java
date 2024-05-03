package mapsandhashmaps;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class HashMaps2 {

    public static void main(String[] args) {

//        // Declare a HashMap and initialise it with values (e.g. "car1" : "Civic", "car2" : "Jazz")
//        Map<String, String> carsMap = new HashMap<String, String>() {
//            {
//                put("car1", "Civic");
//                put("car2", "Jazz");
//                put("car3", "Accord");
//                put("car4", "Type R");
//            }
//        };
//        System.out.println(carsMap);

        // Declare a HashMap and initialise it with values
        Map<String, String> customersAddressMap = new HashMap<String, String>();{
            {
                put("Jason Ong", "Address 1");
                put("Alex Lim", "Address 2");
                put("Samantha Lee", "Address 3");
                put("Carlos Yip", "Address 4");
            }
        };

        // We can refer to the size() to determine the total number that exists within the HashMap
        int customerMapSize = customersAddressMap.size();
        System.out.println("Total Number of customers: " + customerMapSize);

        // Verify whether the map contains a particular Key
        boolean containsKey = customersAddressMap.containsKey("Jason Ong");
        System.out.println(containsKey);

        // Verify whether the map contains a value
        // TODO: compare by setting all values to lowercase before checking
        boolean containsAddress = customersAddressMap.containsValue("Address 1");
        System.out.println(containsAddress);

    }
}
