import java.util.*;

public class Demo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(3, "Banana");
        tree.put(1, "Apple");
        tree.put(2, "Cherry");

        for (var entry : tree.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}



