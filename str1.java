public class str1 {
    public static void atoz() {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch + " ");
        }
        System.out.println(sb);
    }

    public static void toUppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;

                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }

    // public static void abcd(String abc) {
    // StringBuilder sb=new StringBuilder("");
    // int a = 1, b = 0, c = 0, d = 0, i = 0;
    // for (i = 0; i < abc.length(); i++) {
    // while (abc.charAt(i + 1) != abc.charAt(i)) {
    // a++;
    // }

    // }
    // System.err.println(abc.charAt(i) + a);
    // }

    public static void main(String[] args) {
        String str = "hi my name is mohd azeem.";
        // String abc = "aaabbcccdd";
        // // abcd(abc);
        toUppercase(str);
        atoz();
    }
}
