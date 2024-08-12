import java.util.*;

public class Map {
    public static void main(String[] args) {
        HashMap hm = new HashMap();

        hm.put(01, "Azeem");
        hm.put(02, "Monu");
        hm.put(03, "Ram");
        hm.put(04, "Rohan");
        hm.put(05, "Zakir");

        Set keySet=hm.keySet();
        Iterator itr=keySet.iterator();

        System.out.println(hm.get(4));
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        
        Collection values=hm.values();
        Iterator itr1=values.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
            
        }

        Set entry=hm.entrySet();
        Iterator itr2=entry.iterator();
        
        while (itr2.hasNext()) {
            
            System.out.println(itr2.next());
        }

    }

    public class Entry<T1, T2> {
    }
}
