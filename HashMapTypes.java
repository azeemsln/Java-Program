import java.util.*;

public class HashMapTypes {
    public static void main(String[] args) {

        // hashmap implementaion
        HashMap<Integer,String> map=new HashMap<>();
        map.put(3,"azeem");
        map.put(1,"abc");
        map.put(5,"monu");
        map.put(12,"kallu");
        map.put(8,"xyz");

        System.out.println("HashMap is "+ map);

        System.out.println("*****************************************");

        // LinkedHashMap Implementation
        LinkedHashMap<Integer,String> Lmap=new LinkedHashMap<>();
        Lmap.put(3,"azeem");
        Lmap.put(1,"abc");
        Lmap.put(5,"monu");
        Lmap.put(12,"kallu");
        Lmap.put(8,"xyz");
        
        System.out.println("LinkedHashMap is "+ Lmap);

        System.out.println("*****************************************");
        // TreeMap Implementation
        TreeMap<Integer,String> Tmap=new TreeMap<>();
        Tmap.put(3,"azeem");
        Tmap.put(1,"abc");
        Tmap.put(5,"monu");
        Tmap.put(12,"kallu");
        Tmap.put(8,"xyz");

        System.out.println("TreeMap is "+ Tmap);


    }
}
