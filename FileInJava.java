import java.util.*;
import java.io.*;

public class FileInJava {
    public static void main(String[] args) throws IOException
    {
        File file=new File("azeem.txt");
        System.out.println(file.exists());

        file.createNewFile();
        System.out.println(file.exists());

        File dir=new File("azeem");
        System.out.println(dir.exists());

        dir.mkdir();
        System.out.println(dir.exists());

        File f1=new File(dir,"java1.txt");
        f1.createNewFile();
        System.out.println(f1.isFile());
    }
}
