package A1CollectionJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class mainTest {
    public static void main(String[] args) {
        

        //List
        int a[] = new int[5];// fixed array;
        // number of element is fixed use Array();
        // Array is fast compare to collections
        // List can access directly index;

       

        Collection values = new ArrayList();
        // Array list is a class which implements collections indirectly.
        // ArrayList implements List(interface) > List extents collections
        // Collections(interface) -> List(interface) -> ArrayList(Class)
        // by default this value type is object
        // here we can add any kinds of values
        // this array size is not fix
        // we can expand it
        values.add(5);
        values.add("nahian");
        values.add(true);
        System.out.println(values.getClass());
        System.out.println(values.contains(88));
        System.out.println(values.size());



        
        
        // generic<>
        // use angular brackets for generic
        // by using generic we can specify type in collections
        
        Collection<Integer> collectionValue = new ArrayList<>();
        // if we define type in collection we cant added any other type here except Integer


        List<String> listValues = new ArrayList<>();
        //List is more specialized and allows ordered, index-based access.
        // List can contain duplicate values
        listValues.add("Aa");
        listValues.add("Bb");
        listValues.add("Cc");

        System.out.println(listValues.getClass());
        System.out.println(listValues.size());

        
            
        //Set
        Set setValues = new HashSet<>();
        //HashSet offers constant-time performance (O(1)) f
        // set contains unique elements
        //HashSet is another implementation of Set that uses a hash table to store elements.
        setValues.add(4);
        setValues.add(6);
        setValues.add(7);
        setValues.add(7);
        System.out.println(setValues);



        Set treeSet = new TreeSet<>();
        // take O(log n) time 
        // TreeSet is a specific implementation of Set that stores elements in a sorted order
        treeSet.add(10);
        treeSet.add(9);
        treeSet.add(100);
        treeSet.add(84);
        treeSet.add(77);

        System.out.println(treeSet);

        




    }
}
