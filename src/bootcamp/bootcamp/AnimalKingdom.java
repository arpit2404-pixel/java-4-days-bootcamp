package bootcamp;

class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println(name + " says: Meow!");
    }
}

public class AnimalKingdom {
    public static void main(String[] args) {
        Dog dog = new Dog("Bruno", 3);
        Cat cat = new Cat("Milo", 2);

        System.out.println("DOG");
        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println("\\nCAT");
        cat.eat();
        cat.sleep();
        cat.meow();
    }
}
