package setcollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetsCollection2 {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();

        names.add("Santiago");
        names.add("Andrea");
        names.add("Camilio");
        names.add("Santiago");    // disallows duplicates

        System.out.println(names);

        // Q: Append the newNames to names using a for loop
        String[] newNames = {"John", "Benny", "Maggie"};

        // Solution 1 (Martin)
        for (int i = 0; i < newNames.length; i++) {
            names.add(newNames[i]);
        }

        // Solution 2: Loop through the String array and add each element to the HashSet (Gemini)
//        for (String name : newNames) {
//            names.add(name);
//        }
////
////        // Solution 3: Add all elements from the array to the HashSet using addAll (Gemini)
//        names.addAll(Arrays.asList(newNames));
//
        System.out.println(names);

        // For each name in names, print out each corresponding name found in the Set "names"
        for (String name : names) {
            System.out.println(name);
        }

        // Q: Use for each to remove all the values from Set "names"

        // Solution 1: clear() method
        // Remove all elements using the clear() method
//        names.clear();
//        System.out.println(names); // Output: [] (empty set)

        // Solution 2: Using forEach
        // Declare Set namesCopy and initialise with the values from "names"
        // Use Set namesCopy's built-in method (forEach) to remove each name in Set "names"
        HashSet<String> namesCopy = new HashSet<String>(names);
        namesCopy.forEach(name->{
            names.remove(name);
        });
        System.out.println(names);
    }
}
