import java.util.*;
import java.io.*;

public class FilewriteInJava {
    public static void main(String[] args) throws IOException
    {
        File dir=new File("azeem");
        File file=new File(dir,"java1.txt");
        FileWriter fw=new FileWriter(file);
        fw.write("azzu");
        fw.write(65);
        fw.write(97);
        char ch[]={'j','a','v','a'};
        fw.write(ch);

        fw.close();
    }
}
