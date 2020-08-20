package lvn_9_0808.btvn;

import java.util.*;

public class Main01 {
    public static void main(String[] args) {
        Map<Order, ArrayList<OrderDetail>> map01 = new TreeMap<>();

        Order o1 = new Order(1, new Date("10/2/2018"), "cus01");
        ArrayList<OrderDetail> arr1 = new ArrayList<>();
        arr1.add(new OrderDetail(1, 1, 1,10, 100));
        arr1.add(new OrderDetail(1, 2, 5, 100, 10));
        map01.put(o1, arr1);
        o1 = new Order(2, new Date("20/5/2019"), "cus01");
        arr1.add(new OrderDetail(2, 1, 1,10, 100));
        arr1.add(new OrderDetail(2, 2, 5, 100, 10));
        map01.put(o1, arr1);

        Map<Order, ArrayList<OrderDetail>> map02 = new TreeMap<>(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if(o1.getCustomerID().compareTo(o2.getCustomerID()) == 0){
                    if(o1.getIdOrder() > o2.getIdOrder()){
                        return 1;
                    }
                    else if(o1.getIdOrder() < o2.getIdOrder()){
                        return -1;
                    }
                    else {
                        return 0;
                    }
                }
                else {
                    return o1.getCustomerID().compareTo(o2.getCustomerID());
                }
            }
        });
        map02.putAll(map01);
        ArrayList<OrderDetail> arrayList = map02.get(o1);

        for(OrderDetail orderDetail : arrayList){
            System.out.println(orderDetail.toString());
        }
        OrderDetail orderDetailSearch = new OrderDetail(2, 2, 5, 100, 10);
        int index = Collections.binarySearch(arrayList, orderDetailSearch, new Comparator<OrderDetail>() {
            @Override
            public int compare(OrderDetail od1, OrderDetail od2) {
                if(od1.getItemID() > od2.getItemID()){
                    return 1;
                }
                else if(od1.getItemID() < od2.getItemID()){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
        System.out.println(index);
    }
}
