package A1CollectionJava.ListArrayListExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainTest {
    // source : https://www.w3resource.com/java-exercises/collection/array-list.php
    
    public static void main(String[] args) {
        //2
       
        try {
            List<String> list_string = new ArrayList<>();
            list_string.add("55");
            list_string.add("57");
            list_string.add("77");
            list_string.add("99");
            list_string.add("Jakir");
            System.out.println(list_string);
    
            //loop iterate
            // for loop over objects
            // for (int i = 0; i < list_string.size(); i++) {
            //     // System.out.println(list_string.get(i));
            // }
    
            //for-each
            // for (String element : list_string) {
            //     System.out.println(element);
            // }
    
            //3 insert item in specific index // add (method)
            // list_string.add(2, "nahian");
            // System.out.println(list_string);
    
            //5 update /replace a list element  
            // list_string.set(2, "Foso");
            // System.out.println(list_string);
    
            //6 remove element
            // list_string.remove(1);
            // System.out.println(list_string);
    
            //7 search
            // if (list_string.contains("99")) {
            //     System.out.println("found");
            // }
    
            // else {
            //     System.out.println("not found");
            // }
            
            //8 - sort a array
            // Collections.sort(null);
            // list_string.sort(null);
             // list_string.sort((a, b) -> b.compareTo(a));
            // System.out.println(list_string);

            
            // 12 extract a portion of an array list.
            // System.out.println(list_string.subList(0, -1));
            // System.out.println(list_string);

            

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }


    }

}
