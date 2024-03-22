package StaticUse.StaticVariable.Ex3_object_counting;

//110 playlist
public class Student {
    // int count = 0;
    // if we use not static! when a object initialize this count will be starting from 0

    static int count = 0;
    // if we use static this variable will stay const . will not reset if any object initialize  

    Student(){
        // count = count +1;
        // when this constructor initialize count will be increment 
        count++;
    }

    void _getCurrentCount(){
        System.out.println("current count: "+count);
    }
}
