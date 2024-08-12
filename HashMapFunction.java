import java.util.*;
import java.util.Map.Entry;

public class HashMapFunction {
    public static void main(String[] args) {

        // creating hashmap
        HashMap<Integer,String> hashmap =new HashMap<Integer,String>();
        hashmap.put(1,"Azeem");
        hashmap.put(2,"Monu");
        hashmap.put(3,"abc");
        hashmap.put(4,"xyz");
        System.out.println(hashmap);


        // get() function.....
        String result= hashmap.get(2);

        System.out.println("Value at the key 2 is " + result);


        // containsKey() function
        System.out.println(hashmap.containsKey(8));
        System.out.println(hashmap.containsKey(1));


        // remove() function
        hashmap.remove(3);
        System.out.println("updated Hashmap"+hashmap);


        System.out.println(hashmap.entrySet());
        System.out.println(hashmap.entrySet().size());
        // System.out.println(hashmap.entrySet());



        // iterating using for loop

        for(Entry<Integer, String> e:hashmap.entrySet()){
                System.out.println(e.getKey() +" : "+ e.getValue());
        }

    }
}
