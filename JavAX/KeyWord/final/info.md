# resource = (https://www.youtube.com/watch?v=__vHJJf5vWc&list=PLgH5QX0i9K3oAZUB2QXR-dZac0c9HNyRa&index=144)

## final methods (Cannot be overridden by subclasses.)

## final class (Cannot be subclassed.)

## final parameters (The parameter value cannot be reassigned within the method.)
## Final References (The reference cannot be changed, but the object's state can be modified unless the object is immutable.)

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
