package jav140thisKeyword;

public class Test {
    public static void main(String[] args) {
        Person obj1 = new Person("jayed",220);
        Person obj2 = new Person("jayed",220, "brown");
        Person obj3 = new Person("jayed",220, "brown", false);
        obj3.displayInfo();

    }
}
