public class Oops1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("black");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("red");
    }
}

class Pen {
    // properties
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // functions
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}