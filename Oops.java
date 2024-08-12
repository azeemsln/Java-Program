public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("black");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "red";
        System.out.println(p1.color);
        BankAccount myacc = new BankAccount();
        myacc.username = "azeem786";
        System.out.println(myacc.username);
        myacc.setPassword("12344");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        this.password = "pwd";
    }
}

class Pen {
    // properties
    String color;
    int tip;

    // functions
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int math, int chem) {
        percentage = (phy + math + chem) / 3;
    }
}
