class Person {
    // Private field (data)
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter method to access the private field
    public String getName() {
        return name;
    }

    // Setter method to modify the private field
    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person("Alice");

        // Access the private field using getter
        System.out.println("Name: " + person.getName());

        // Modify the private field using setter
        person.setName("Bob");
        System.out.println("Updated Name: " + person.getName());
    }
}
