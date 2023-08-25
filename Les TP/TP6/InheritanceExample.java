class Animal {
    String species;

    Animal(String species) {
        this.species = species;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String name;

    Dog(String name) {
        super("Canine"); // Call the constructor of the superclass
        this.name = name;
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks");
    }
}

class Cat extends Animal {
    String name;

    Cat(String name) {
        super("Feline"); // Call the constructor of the superclass
        this.name = name;
    }

    @Override
    void makeSound() {
        System.out.println(name + " meows");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        dog.makeSound(); // Output: Buddy barks
        cat.makeSound(); // Output: Whiskers meows
    }
}
