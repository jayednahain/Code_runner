package JavAX.Jav121VariableLengthArgument;

public class Demo {

    String temp="";

    String addString(String... params) {
        for (int i = 0; i < params.length; i++) {
            System.out.println(params[i]);
            temp = temp + params[i] + " ";
        }
        return temp;
    }
    
    int addTwoNumber(int... params) {
        
        int temp = 0;
        
        for (int i = 0; i < params.length; i++) {
            temp = params[i] + temp;
        }
        return temp;
    }
}
