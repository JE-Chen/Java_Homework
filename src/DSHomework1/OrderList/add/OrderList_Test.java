package DSHomework1.OrderList.add;


public class OrderList_Test {

    public static void main(String[] argv) {
        OrderListAdd<String> orderList = new OrderListAdd<>();
        orderList.add("H");
        orderList.add("G");
        orderList.add("D");
        orderList.add("C");
        orderList.add("B");
        orderList.add("A");
        orderList.add("E");
        orderList.add("F");
        orderList.add("I");
        System.out.println(orderList.toString());

        OrderListAdd<Integer> orderList1 = new OrderListAdd<>();
        orderList1.add(50);
        orderList1.add(30);
        orderList1.add(40);
        orderList1.add(10);
        orderList1.add(20);
        System.out.println(orderList1.toString());
    }
}
