// import java.util.*;

public class type_casting {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int num = 123;
        char ch = '4';
        String str = "567";

        int ch2num = Character.getNumericValue(ch);
        int str2num = Integer.parseInt(str);
        char num2ch = (char) (num + '0'); // Assuming num is a single-digit number
        char anyNum2chFD = Integer.toString(num).charAt(0); // any no. of digit num, left most digit of num
        char anyNum2chLD = (char) (num % 10 + '0'); // any no. of digit num, righ most digit of num
        char str2chFD = str.charAt(0); // any no. of character String, left most charachet of String
        char str2chLD = str.charAt(str.length() - 1); // any no. of character String, right most charachet of String
        String num2str = String.valueOf(num);
        String ch2str = String.valueOf(ch);

        System.out.println("ch2num: " + ch2num); // Output: 4
        System.out.println("str2num: " + str2num); // Output: 567
        System.out.println("anyNum2chFD: " + anyNum2chFD); // Output: '1'
        System.out.println("anyNum2chLD: " + anyNum2chLD); // Output: '3'
        System.out.println("num2ch: " + num2ch); // Output: '«'
        System.out.println("str2ch: " + str2chFD); // Output: '5'
        System.out.println("str2ch: " + str2chLD); // Output: '7'
        System.out.println("num2str: " + num2str); // Output: "123"
        System.out.println("ch2str: " + ch2str); // Output: "4"

        // sc.close();
    }
}

// import java.awt.*;

// // import java.awt.event.*;
// class type_casting extends Frame {
//     TextField name, pass;
//     Button b1, b2;

//     type_casting() {
//         setLayout(new FlowLayout());
//         this.setLayout(null);
//         Label n = new Label("Name:", Label.CENTER);
//         Label p = new Label("password:", Label.CENTER);
//         name = new TextField(20);
//         pass = new TextField(20);
//         pass.setEchoChar('#');
//         b1 = new Button("submit");
//         b2 = new Button("cancel");
//         this.add(n);
//         this.add(name);
//         this.add(p);
//         this.add(pass);
//         this.add(b1);
//         this.add(b2);
//         n.setBounds(70, 90, 90, 60);
//         p.setBounds(70, 130, 90, 60);
//         name.setBounds(200, 100, 90, 20);
//         pass.setBounds(200, 140, 90, 20);
//         b1.setBounds(100, 260, 70, 40);
//         b2.setBounds(180, 260, 70, 40);
//     }

//     public static void main(String args[]) {
//         type_casting ml = new type_casting();
//         ml.setVisible(true);
//         ml.setSize(400, 400);
//         ml.setTitle("my login window");
//     }
// }