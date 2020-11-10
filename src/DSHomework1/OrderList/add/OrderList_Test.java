package DSHomework1.OrderList.add;

import java.util.ArrayList;
import java.util.List;

public class OrderList_Test {

    public static void main(String[] argv) {
        List<String> stringList = new ArrayList<>();
        OrderListAdd<String> orderListAdd = new OrderListAdd<>(stringList);
        orderListAdd.add("A");
        orderListAdd.add("B");
        orderListAdd.add("C");
        orderListAdd.add("D");
        orderListAdd.add("E");
        orderListAdd.add("F");
        orderListAdd.add("G");
        System.out.println(stringList.toString());
    }

}
