## javas variable are static type;
- once you declare it will not change directly.
Primitive types and reference type
- Primitive types are: number boolean and character
- every thing else are reference type
- - if we declare reference type , by default it will set to null
## Java manage two diffrent area of memory
- Heap
    - Objects
- stack
    - primitives and short-lived variables
## Memory allocation
```java
var textBoxObj1 = new TextBox();
var textBoxObj2 = textBoxObj1;
```
- both this variables are referencing the same object on the heap
- variables on stack ar textBoxObj1 , textBoxObj2 taking reference of this object
- if we make changes to this object this changes will available to other object

## memory deAllocation
- when we exit a method , java runtime will remove all the variable on stack