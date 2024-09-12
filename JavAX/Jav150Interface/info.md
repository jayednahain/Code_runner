## interface
- interface is fully abstract
- interface is collection of abstract method
- non abstract method cant stay on interface 


## dealer interface
```java
interface mainTest {
    //java compiler default adds public and abstract keyword before interface method
} 
```
- 

## interface variable
```java
interface mainTest {
    
    int speed = 20;
    // actual convention
    // public static final int speed = 20;
    // java compiler adds public, static and final keywords before the interface variable
} 

```
## why we use interface?
- interface

## class relation
- interface vs interface and class vs class **extends**
- interface vs class **implements**

## multiple inheritance problem
<img src="Screenshot from 2024-09-10 15-47-15.png" width="800" title="hover text">


## why java interface doesn't support constructor
In Java, interfaces don't support constructors because they are not meant to instantiate objects directly. Interfaces define a contract or blueprint for classes, specifying methods that must be implemented, but they do not provide implementation details themselves. Constructors, on the other hand, are specific to classes because they are used to initialize an object's state when it is created.

Here’s why interfaces don't support constructors:

No Object Instantiation: An interface cannot be instantiated on its own. Since constructors are used to create and initialize objects, there's no need for constructors in an interface. Classes that implement the interface will provide the constructor logic.

Abstract Nature of Interfaces: Interfaces are abstract by nature—they focus solely on the "what" (i.e., method signatures), not the "how" (i.e., implementation). Constructors are part of the implementation details of a class, and since interfaces don’t have any implementation, constructors are irrelevant.

Multiple Inheritance: Java allows a class to implement multiple interfaces, but it doesn’t allow multiple inheritance of classes (which can have constructors). This is partly to avoid ambiguity about which constructor would be called if constructors were allowed in interfaces.

In essence, constructors belong to classes because classes are responsible for creating and initializing objects, while interfaces are only responsible for defining the structure of what a class should do.