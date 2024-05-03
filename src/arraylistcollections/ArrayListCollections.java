package arraylistcollections;

import java.util.ArrayList;

public class ArrayListCollections {

    public static void main(String[] args) {

        // 1. Create an ArrayList of participants
        ArrayList<String> participantList = new ArrayList<String>();

        // Alternate way of declaring an ArrayList
        // ArrayList<String> participantList = new ArrayList<>();

        System.out.println(participantList);
        System.out.println(participantList.size());

        // add a value to participantList
        participantList.add("James");
        System.out.println("The size of the participantList now is: " + participantList.size());
        System.out.println(participantList);

        // add more elements to the ArrayList called participantList
        participantList.add("Patrick");
        participantList.add("Angela");
        participantList.add("Benny");
        System.out.println(participantList);
        System.out.println(participantList.size());

        // remove an element from the participantList - removing Benny
        participantList.remove("Benny");
        System.out.println(participantList);
        System.out.println(participantList.size());

        // Use the get method from ArrayList to access element 1
        System.out.println(participantList.get(1));

        // Use the set methods from ArrayList to change the value in element 1
        participantList.set(0, "John");
        System.out.println(participantList);
        System.out.println(participantList.get(0));

        // Q: Use a for loop to change all the values in participant list to value: "To be confirmed"
//        for (int i = 0; i < participantList.size(); i++) {
//            participantList.set(i, "To be confirmed");
//        }
//        System.out.println(participantList);

        // Q: Only change Jameson to the value "Jameson - to be confirmed"
//        for (int i = 0; i < participantList.size(); i++) {
//            if(participantList.get(i) == "John")
//                participantList.set(i, "John " + "- to be confirmed");
//        }

        // Q: Change all participants name to be appended with the value of "<Name> - to be confirmed"
        for (int i = 0; i < participantList.size(); i++) {
            participantList.set(i, participantList.get(i) + " - to be confirmed");

        }

        System.out.println(participantList);

        // ArrayList contains a number of methods that you can use at your disposal to work with the data in it
        System.out.println(participantList.contains("Benny"));
        System.out.println(participantList.contains("John"));
    }
}
