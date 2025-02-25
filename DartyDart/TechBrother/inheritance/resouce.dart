class Animal {
  String name;

  Animal(this.name) {
    print("genericAnimal animal constructor called");
    print("current intilize :" + name);
  }

  void makeSound() {
    print('Animal makes a sound');
  }
}

//// Single Inheritance
class Dog extends Animal {
  // Call the parent's constructor
  Dog(String name) : super(name);

  @override
  void makeSound() {
    // Override the parent's method
    print('$name barks!');
  }
}

// Single Inheritance
class Cat extends Animal {
  // Cat(super.name);
  Cat(String name) : super(name);

  // Call the parent's constructor
  // Cat(String name) : super(name);
  // Cat(String name);

  @override
  void makeSound() {
    print('$name meows!');
  }
}

// Multilevel Inheritance
class Labrador extends Dog {
  Labrador(String name) : super(name);

  void fetch() {
    print('$name is fetching a ball!');
  }
}

void main(List<String> args) {
  Animal genericAnimal = Animal('Generic Animal');
  // Dog myDog = Dog('Buddy');
  // Cat myCat = Cat('Whiskers');
  Labrador myLabrador = Labrador('Max');

  // genericAnimal.makeSound();
  // myDog.makeSound();

  // Multilevel Inheritance called
  myLabrador.makeSound();
}
