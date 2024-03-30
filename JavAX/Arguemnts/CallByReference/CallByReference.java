package JavAX.Arguemnts.CallByReference;

public class CallByReference {
    String name;

    void updateName(CallByReference r2){
        r2.name = "New name";
    }
    
    void method(String name){}
}


