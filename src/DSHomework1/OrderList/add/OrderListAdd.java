package DSHomework1.OrderList.add;

import java.util.List;
import java.util.ListIterator;

public class OrderListAdd<E> {

    private ListIterator listIterator;

    public OrderListAdd(List addList) {
        listIterator = addList.listIterator();
    }

    public void add(E element) {

        while (listIterator.hasNext())
            listIterator.next();

        while (listIterator.hasPrevious()) {
            listIterator.previous();
        }
        listIterator.add(element);
    }

}
