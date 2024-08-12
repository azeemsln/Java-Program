import java.util.*;

public class Strings {
    public static void printLetter(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void checkPalindrom(String str) {
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                i++;
            } else {
                System.out.println("String is not palindrom.");
                break;
            }
        }
        if (i == str.length()) {
            System.out.println("The string is palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.println("Enter your first name.");
        String firstName = str.nextLine();
        System.out.println("Enter your last name.");
        String lastName = str.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println("your full name is ");
        System.out.println(fullName);
        System.out.println(fullName.charAt(1));
        printLetter(fullName);
        System.out.println("Enter a string tp check palindrom.");
        Scanner str1 = new Scanner(System.in);
        String s = str1.nextLine();
        checkPalindrom(s);
        str.close();
        str1.close();
    }
}
