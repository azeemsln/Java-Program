class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }

}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims");
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.swim();
        shark.color = "red";
        shark.eat();
        System.out.println("The color of shark is " + shark.color);
    }

}
