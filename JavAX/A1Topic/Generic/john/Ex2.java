package JavAX.A1Topic.Generic.john;


class Animal {

}


class Cat extends Animal {
    Cat() {
        System.out.println("cat class init");
    }    
}


class Dog extends Animal {
    Dog() {
        System.out.println("Dog class init");
    }
}


class Bird extends Animal {
    Bird() {
        System.out.println("Bird class init");
    }
}


class CustomGenericType<T extends Animal> {
    T value;
    CustomGenericType(T value) {
        this.value = value;
    }

    public void showGenericData() {
        System.out.println(value);
    }

}


public class Ex2 {
    Ex2() {

    }

    CustomGenericType<Cat> customGenericTypeObj1 = new CustomGenericType(new Cat())
}