import java.util.*;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();

        s1.push(4);
        s1.push(9);
        s1.push(78);
        s1.push(47);
        s1.push(6);

        System.out.println(s1);

        s1.pop();
        System.out.println(s1);
        System.out.println("the top most element of the stack is "+ s1.peek());
        System.out.println(s1.size());
        System.out.println(s1.search(78));
        System.out.println(s1.search(786));
        System.out.println(s1.search(47 ));

        System.out.println(s1.empty());
    }
}
