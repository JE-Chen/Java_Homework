import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Iterator;

public class JustTest<E extends Comparable<E>> implements Iterable<E> {
    public static void main(String[] args) {
        JustTest<String> content = new JustTest<String>();
        content.add("A");
        content.add("B");
        content.add("C");
        content.add("D");
        System.out.println(content.toString());
    }
    private LinkedList<E> theList = new LinkedList<E>();
    public void add(E obj) {
        ListIterator<E> iter = theList.listIterator();
        while (iter.hasPrevious()) {
            if (obj.compareTo(iter.next()) > 0) {
                iter.previous();
                iter.add(obj);
                return;
            }
        }
        iter.add(obj);
    }
    public E get(int index) {
        return theList.get(index);
    }
    public Iterator<E> iterator() {
        return theList.iterator();
    }
    public String toString() {
        return theList.toString();
    }
}
