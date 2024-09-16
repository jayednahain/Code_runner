package jav159AnonymousClass;

class Person {
    void showPersonName(){
        System.out.println("this is original function method");
    }
}

class CustomPerson extends Person {
    @Override
    void showPersonName() {
        System.out.println("function is being overridden");
    }
}

// public class Ex1 {
//     public static void main(String[] args) {
//         CustomPerson customPerson = new CustomPerson();
//         customPerson.showPersonName();
//     }
// }


public class AnonymousClassTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.showPersonName();

        Person anonymousObject = new Person(){
            @Override
            void showPersonName() {
                
                System.out.println("this method is call from Anonymous class");

            }
        };

        anonymousObject.showPersonName();
    } 
}


