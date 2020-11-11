package DSHomework1.OrderList.add;

import java.util.LinkedList;
import java.util.ListIterator;

public class OrderList<E extends Comparable<? super E>> extends LinkedList<E>{

    @Override
    public boolean add(E element) {
        ListIterator<E> listIterator = this.listIterator(this.size());
        while (listIterator.hasPrevious()) {
            if (element.getClass() == String.class) {
                String char1 = (String) element;
                if (char1.compareTo((String) listIterator.previous()) > 0) {
                    listIterator.next();
                    listIterator.add((E) char1);
                    return true;
                }
            } else if (element.getClass() == Integer.class) {
                Integer num1 = (Integer) element;
                if (num1.compareTo((Integer) listIterator.previous()) > 0) {
                    listIterator.next();
                    listIterator.add((E) num1);
                    return true;
                }
            }
        }
        listIterator.add(element);
        return false;
    }
}
