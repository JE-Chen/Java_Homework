package DSHomework1.OrderList.add;


public class OrderList_Test {

    public static void main(String[] argv) {
        OrderListAdd<String> orderList = new OrderListAdd<>();
        orderList.add("A");
        orderList.add("B");
        orderList.add("C");
        orderList.add("D");
        orderList.add("E");
        orderList.add("F");
        orderList.add("G");
        orderList.add("H");
        orderList.add("I");
        orderList.add("J");
        orderList.add("K");
        System.out.println(orderList.get(0));
        System.out.println(orderList.toString());
        OrderListAdd<Integer> orderList1 = new OrderListAdd<>();
        orderList1.add(10);
        orderList1.add(20);
        orderList1.add(30);
        System.out.println(orderList1.get(0));
        System.out.println(orderList1.toString());
    }

}
