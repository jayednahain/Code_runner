package JavAX.Arguemnts.CallByReference;

public class Test {

    public static void main(String[] args) {
        
        CallByReference obj1= new CallByReference();
        
        obj1.name ="old name";
        System.out.println("Before calling: "+obj1.name);

        obj1.updateName(obj1);
        System.out.println("after calling: "+obj1.name);
    
    }
        
}
    
