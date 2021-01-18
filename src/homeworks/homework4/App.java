package homeworks.homework4;

import java.util.Comparator;
import java.util.Iterator;

public class App {

    public static void main(String[] args) {
        //Task 1 complete

        //Task 2 complete

        //Task 3 - complete in Tasks: 9, 12.

        //Task 4 complete, but only +1 increase size data array

        //Task 5 complete

        //Task 6 complete

        //Task 7 complete

        //Task 8 complete

        //Task 9 complete

        //Task 10 complete

        //Task 11* complete

        //Task 12** complete

        //Task 13** complete


        //простая тестовая реализация для сортировки строк по первой букве.
        //не является частью задания
        String[] arr = new String[]{"ccc", "bbb", "aaa", "zzz", "uuu"};
        DataContainer<String> container = new DataContainer<String>(arr);
        Iterator<String> iterator = container.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Comparator comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(0) > o2.charAt(0)) {
                    return 1;
                } else if (o1.charAt(0) == o2.charAt(0)) {
                    return 0;
                } else if (o1.charAt(0) < o2.charAt(0)) {
                    return -1;
                }
                return 0;
            }
        };
        container.sort(comp);
        System.out.println();
        Iterator<String> iterator1 = container.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }


    }
}
