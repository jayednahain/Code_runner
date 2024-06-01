# resource - (https://www.youtube.com/watch?v=WeB03aowC-k&list=PLgH5QX0i9K3oAZUB2QXR-dZac0c9HNyRa&index=142)

<img src="images/Screenshot from 2024-05-22 13-52-17.png" width="600"/> 

#
# 1. refer current class instance variable

```java
public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
```
In Java, using this keyword is essential when you want to refer to the instance variables of a class inside its methods or constructors, especially when the parameter names are the same as the instance variable names. Here's a detailed explanation and corrected version of your code:
- Variable Shadowing
- Variable shadowing occurs when a variable declared within a certain scope (in this case, the constructor) has the same name as a variable declared in an outer scope (in this case, the class fields).
#
# 2. used to call current class constructor
```java
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

public class Test {
    public static void main(String[] args) {
        Person obj1 = new Person("jayed",220);
        Person obj2 = new Person("jayed",220, "brown");
        Person obj3 = new Person("jayed",220, "brown", false);
        obj3.displayInfo();

    }
}

```
In Java, when one constructor calls another constructor in the same class, it is referred to as constructor chaining. This is done using the this keyword with appropriate arguments. The this call should be the first statement in the constructor.
- Constructor Chaining
- when one constructor calls another constructor in the same class, it is referred to as constructor chaining.

# 3 used to called current class method
```java
public class Person {
   
    void displayMessage(){
        System.out.println("displayMessage called");
    }

    void displayInfo (){
        this.displayMessage();
        displayMessage();
        System.out.println("displayInfo called");
    }
}
```
- With this keyword:
```java
void displayInfo() {
    this.displayMessage();  // Explicitly refers to the current instance's method
    System.out.println("displayInfo called");
}
```
- Without this keyword:
```java
void displayInfo() {
    displayMessage();  // Implicitly refers to the current instance's method
    System.out.println("displayInfo called");
}
```

### Explicitly refers 
- Makes it clear that the method being called belongs to the current instance of the class.
- Useful for readability, especially in large classes or when the method name might be shadowed by a local variable.
- Necessary when calling a method from within an anonymous inner class or when the method is shadowed by a parameter or local variable with the same name.

### Implicitly refers
- The method is still called on the current instance, but this is implied.
- Generally, Java will resolve the method call correctly to the current instance's method.
- Makes the code slightly cleaner and less verbose.

# 4 using this as passing as arguments


