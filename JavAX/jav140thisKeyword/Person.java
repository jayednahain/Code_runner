package jav140thisKeyword;

public class Person {
    String name;
    int age;
    String hairColor;
    boolean human;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    Person(String name, int age , String hairColor){
        // this.name = name;
        // this.age = age;
        this(name, age);
        this.hairColor = hairColor;
    }


    Person(String name, int age, String city , boolean human){
        this(name,age,city);
        this.human = human;
    }

    void displayInfo (){
        System.out.println("name    :"+ name);
        System.out.println("age    :"+ age);
        System.out.println("hair color    :"+ hairColor);
        System.out.println("human    :"+ human);

    }
}
