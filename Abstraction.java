abstract class Animal {
    String color;

    Animal() {
        color = "Brown";
    }

    void eat() {
        System.out.println("Eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "Black";
    }

    void walk() {
        System.out.println("Walk on 4 legs.");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "White";
    }

    void walk() {
        System.out.println("Walk on two legs.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        Chicken ch = new Chicken();
        ch.eat();
        ch.walk();
        h1.changeColor();
        System.out.println("The color of horse is " + h1.color);
        System.out.println("The color of chicken is " + ch.color);
    }
}
