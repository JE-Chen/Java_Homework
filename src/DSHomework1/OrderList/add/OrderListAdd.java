package DSHomework1.OrderList.add;

import java.util.LinkedList;
import java.util.ListIterator;

public class OrderListAdd<E> extends LinkedList<E> {

    private ListIterator<E> listIterator;

    public OrderListAdd() {
        listIterator = this.listIterator();
    }

    @Override
    public boolean add(E element) {

        while (listIterator.hasNext())
            listIterator.next();

        while (listIterator.hasPrevious()) {
            listIterator.previous();
        }
        listIterator.add(element);
        return false;
    }

}
