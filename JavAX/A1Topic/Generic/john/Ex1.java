package JavAX.A1Topic.Generic.john;

class GenericTypeTest<T> {
    T value;

    GenericTypeTest(T value) {
        System.out.println("generic class init | current type : "+ value.getClass().getSimpleName());
        
        this.value = value;
    }

    void genericValue() {
        System.out.println(value);
    }
}

public class Ex1 {
    public static void main(String[] args) {
        GenericTypeTest<String> showString = new GenericTypeTest<String>("ki obostha");
        showString.genericValue();

        GenericTypeTest<Integer> showInt = new GenericTypeTest<Integer>(100);
        showInt.genericValue();

        GenericTypeTest<Double> showDouble = new GenericTypeTest<Double>(2.22);
        showDouble.genericValue();

    }
}
