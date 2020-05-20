import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Practice {
   /* public static void main(String[] args) {
        List<String> stList = Arrays.asList("A", "B", "C");
        stList.parallelStream().forEach(Practice::accept);
    }

    private static String add(String a) {
        return "A" + a;
    }

    //Create Method accept to keep your validation logic : And Make call
    private static boolean accept(String s) {
        return add(s).equals("AA");
    }*/
/*
    public void main111(String[] args) {
        List<String> stList = Arrays.asList("A", "B", "C");
      *//*  Map<String, String> collect = stList.parallelStream().
                                            map(Practice::add).
                                            filter(Objects::nonNull).
                                            collect(Collectors.toMap(k -> k, v -> v));
        System.out.println(collect);*//*
        Map<String, String> a = new LinkedHashMap<>();

        stList.stream().map(Practice::add).forEach(add -> {
            if (add != null) {
                for (Map.Entry<String, String> m1 : add.entrySet()) {
                    a.put(m1.getKey(), m1.getValue());
                }
            }
        });

        //stList.entrySet().stream().map(this::add).collect(toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println(a);
    }*/

    private static Map<String, String> add(String a) {
        Map<String,String> mp = new LinkedHashMap<>();
        mp.put(a,a);
        return mp;
    }
/*
    private static String add(String a) {
        return "A"+a;
    }*/

   /* public static void main(String[] args) {
        List cards = Arrays.asList("Visa", "MasterCard", "American Express", "Visa");
        Map cards2Length = cards.stream() .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(cards2Length);

    }*/

    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("A","B","C");
/*
        l1.stream().map(Practice::add).collect(Collectors.toMap(k -> k, v -> v));
*/
       // Stream<Map<String, String>> mapStream = l1.stream().map(Practice::add).flatMap((k,v) -> (add(k,v)).

        //l1.stream().map(a ->return Practice.add(a)).collect(Collectors.toMap());

        Map<String, String> collect = l1.stream().map(Practice::add).flatMap(map -> map.entrySet().stream()).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
        System.out.println(collect);
    }

    Map<String, Long> toMap(Stream<Map<String, Long>> stream) {
        return stream.flatMap (map -> map.entrySet().stream()) // this would create a flattened
                // Stream of all the map entries
                .collect(Collectors.toMap(e -> e.getKey(),
                        e -> e.getValue())); // this should collect
        // them to a single map
    }
}
