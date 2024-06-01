# resource = (https://www.youtube.com/watch?v=__vHJJf5vWc&list=PLgH5QX0i9K3oAZUB2QXR-dZac0c9HNyRa&index=144)

## final methods
- we can inherit final method  
- but cannot overridden it by subclasses.
```java

public class University {
    final void display1(){
        System.out.println("class university");
    }
}

public class Student extends University {
    void display1(){
        //if we override this method we will get this warning
        //Cannot override the final method from UniversityJava(67109265)
        System.out.println("display one updated");
    }
    void display2(){
        System.out.println("student display method");
    }
}

public class Test {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.display1();
        //but we can inherit this method
        obj1.display2();
    }   
}


```

## final class (Cannot be subclassed.)
- we can extends final class


## final parameters
- The parameter value cannot be reassigned within the method.
## Final References
- The reference cannot be changed, but the object's state can be modified unless the object is immutable.

## final variable (The value cannot be changed once assigned)
```java
    final String name
```
## blank final variable
```java
    final String name; // Blank final variable
    final int age; // Blank final variable
```
- we must can assign blank final variable on constructor
- we cant assign to any other place  
```java
Person(String name, int age) {
        // name = "Kabir"
        this.name = name;
        this.age = age;
    }
```   
#
- static blank final variable
    - we cant assign blank final variable on constructor 
    - we can initialize though static block 
    
```java

static final int number;

static{
    number = 5;
}

```

# questions

