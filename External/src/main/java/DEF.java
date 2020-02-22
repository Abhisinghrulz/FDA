import java.util.LinkedList;
import java.util.List;

public class DEF {
    public static void main(String[] args) {
        List<String> lt = new LinkedList<>();
        lt.add("B");
        lt.add("C");
        lt.add("D");

        lt.forEach(System.out::println);

    }
}
