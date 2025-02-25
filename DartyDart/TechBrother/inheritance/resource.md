# Types of Inheritance (as conceptual models):
While the phrase "types of inheritance" can be used, it is very important to know that Dart does not support multiple inheritance.

## Single Inheritance:
- A class inherits from only one parent class.
- Dart supports this form of inheritance.
- This is the most common and straightforward type.


## Multilevel Inheritance:
- A class inherits from another child class, creating a chain of inheritance.
- Dart supports multilevel inheritance.
- For example: Class A->Class B->Class C. Class C inherits from Class B, and Class B inherits from class A.


## Hierarchical Inheritance:
- Multiple child classes inherit from a single parent class.
- Dart supports this form of inheritance.
- For example: Class A-> Class B, and Class A-> Class C. Both Class B and Class C inherit from Class A.