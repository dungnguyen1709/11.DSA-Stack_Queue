package li_thuyet;
import java.util.ArrayList;
import java.util.Iterator;

public class WapperClass {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Minh");
        list.add("Hung");
        list.add(10);
        list.add(10.5);
        for (int i = 0; i < list.size();i++) {
            System.out.println(list.get(i));
        }

        for (Object element : list) {
            System.out.println(element);
        }

        Iterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
