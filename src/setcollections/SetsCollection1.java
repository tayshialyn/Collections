package setcollections;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SetsCollection1 {

    public static void main(String[] args) {

        // Create a HashSet using the set interface
        HashSet<String> data = new HashSet<String>();
        System.out.println(data);

        // Populate the data set with some CS subjects
        data.add("HTML");
        data.add("CSS");
        data.add("Javascript");
        data.add("Java");
        data.add("Javascript");    // disallows duplicates
        System.out.println(data);   // the data that is rendered is unsorted


        // ArrayList allowing sorting of data - which is not available in Sets and HashSet
        ArrayList<String> dataArrList = new ArrayList<String>();

        dataArrList.add("Mar");
        dataArrList.add("Colin");
        dataArrList.add("Richard");
        dataArrList.add("Dave");
        dataArrList.sort(Comparator.naturalOrder());
        System.out.println(dataArrList);
        dataArrList.sort(Comparator.reverseOrder());
        System.out.println(dataArrList);






    }
}
