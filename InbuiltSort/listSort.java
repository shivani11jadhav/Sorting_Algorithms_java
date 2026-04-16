import java.util.*;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);

        Collections.sort(list);

        System.out.println("Sorted list: " + list);
    }
}
