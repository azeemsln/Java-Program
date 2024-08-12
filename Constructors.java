public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Mohd Azeem");
        s1.rollno = 123;
        s1.marks[0] = 100;
        s1.marks[1] = 18;
        s1.marks[2] = 98;
        Student s2 = new Student(s1);
        System.out.println(s1.name);
        System.out.println("hi");

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int rollno;
    int marks[];

    Student(String name) {
        this.name = name;
        marks = new int[3];
    }

    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.marks = s1.marks;
        // for (int i = 0; i < marks.length; i++) {
        // this.marks[i] = s1.marks[i];
        // }

    }
}