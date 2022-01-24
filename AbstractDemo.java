public class AbstractDemo {

    public static void main(String args[]) {
        // Human obj = new Human(); Cannot instantiate the type HumanJava
        Man man = new Man();
        man.eat();
        man.walk();
        Human man2 = new Man();
        man2.eat();
        man2.walk();

    }
}

abstract class Human { // Absatract class
    public abstract void eat();

    public void walk() {
        System.out.println("Human walking");
    }
}

class Man extends Human { // Concrete class
    public void eat() {
        System.out.println("Man eating");
    }
}