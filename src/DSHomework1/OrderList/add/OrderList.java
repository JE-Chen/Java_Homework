package DSHomework1.OrderList.add;

import java.util.LinkedList;
import java.util.ListIterator;

public class OrderList<E extends Comparable<? super E>> extends LinkedList<E>{

    @Override
    public boolean add(E element) {
        ListIterator<E> listIterator = this.listIterator(this.size());
        while (listIterator.hasPrevious()) {
                if (element.compareTo(listIterator.previous()) > 0) {
                    listIterator.next();
                    listIterator.add(element);
                    return true;
                }
        }
        listIterator.add(element);
        return false;
    }
}

