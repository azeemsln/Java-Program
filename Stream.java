import java.util.*;
import java.util.stream.*;
import java.util.Arrays;
public class Stream {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,4,5,8,20,21,9);

        list.forEach(i-> System.out.println(i));

        
        java.util.stream.Stream<Integer> StreamData=list.stream();
        
        // long count=StreamData.count();
        // System.out.println(count);



        java.util.stream.Stream<Integer> sortedData=StreamData.sorted();

        java.util.stream.Stream<Integer> mapData=sortedData.map(n->n*2);
        mapData.forEach(i-> System.out.println(i));

    }
}
