public class Super {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

abstract class Animal {
    String color = "Blue";

    Animal() {
        System.out.println("Animal constructor is called.");
    }

    void eat() {
        System.out.println("Eats");
    }

}

class Horse extends Animal {
    Horse() {
        super();
        System.out.println("HOrse constructor is called.");
    }
}