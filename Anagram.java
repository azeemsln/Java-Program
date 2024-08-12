import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        String s1="School Master";
        String s2="The classroom";
        s1=s1.replace(" ","").toLowerCase();
        s2=s2.replace(" ","").toLowerCase();
        char []ch1=s1.toCharArray();
        char []ch2=s2.toCharArray();
        // System.out.println(ch1[5]);
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("Given string is anagram.");
        }
        else{
            System.out.println("Given strings is not Anagram.");
        }
    }
}
