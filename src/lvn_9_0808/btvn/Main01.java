package lvn_9_0808.btvn;

import java.util.*;

public class Main01 {
    public static void main(String[] args) {
        Map<Order, ArrayList<OrderDetail>> map01 = new TreeMap<>();
        Calendar calendar01 = Calendar.getInstance();
        calendar01.set(Calendar.YEAR, 2020);
        calendar01.set(Calendar.MONTH, 9);
        calendar01.set(Calendar.DATE, 22);
        Date date01 = calendar01.getTime();
        Calendar calendar02 = Calendar.getInstance();
        calendar02.set(Calendar.YEAR, 2019);
        calendar02.set(Calendar.MONTH, 7);
        calendar02.set(Calendar.DATE, 12);
        Date date02 = calendar02.getTime();
        Calendar calendar03 = Calendar.getInstance();
        calendar03.set(Calendar.YEAR, 2005);
        calendar03.set(Calendar.MONTH, 10);
        calendar03.set(Calendar.DATE, 2);
        Date date03 = calendar03.getTime();
        Calendar calendar04 = Calendar.getInstance();
        calendar04.set(Calendar.YEAR, 2018);
        calendar04.set(Calendar.MONTH, 3);
        calendar04.set(Calendar.DATE, 19);
        Date date04 = calendar04.getTime();
        Order order01 = new Order(1, date01, "cus01");
        Order order02 = new Order(2, date02, "cus02");
        Order order03 = new Order(3, date03, "cus03");
        Order order04 = new Order(4, date04, "cus04");

        List<OrderDetail> list01 = new ArrayList<>();
        list01.add(new OrderDetail(1, 100, 288, 2, 10));
        list01.add(new OrderDetail(1, 101, 50, 10, 5));
        list01.add(new OrderDetail(1, 102, 185, 2, 10));

        List<OrderDetail> list02 = new ArrayList<>();
        list02.add(new OrderDetail(2, 100, 288, 2, 10));
        list02.add(new OrderDetail(2, 101, 50, 10, 5));
        list02.add(new OrderDetail(2, 103, 100, 1, 15));

        List<OrderDetail> list03 = new ArrayList<>();
        list03.add(new OrderDetail(3, 100, 288, 9, 10));
        list03.add(new OrderDetail(3, 103, 100, 6, 15));

        List<OrderDetail> list04 = new ArrayList<>();
        list04.add(new OrderDetail(4, 100, 288, 9, 10));
        list04.add(new OrderDetail(4, 101, 50, 1, 5));
        list04.add(new OrderDetail(4, 102, 185, 5, 10));
        list04.add(new OrderDetail(4, 103, 100, 4, 15));

        //treemap put()
        map01.put(order01, (ArrayList<OrderDetail>) list01);
        map01.put(order02, (ArrayList<OrderDetail>) list02);
        map01.put(order03, (ArrayList<OrderDetail>) list03);
        map01.put(order04, (ArrayList<OrderDetail>) list04);
        //print treemap
//        for (Order key : map01.keySet() )
//        {
//            List<OrderDetail> name = map01.get (key);
//            System.out.println(key.getIdOrder());
//            for(int i=0; i<name.size(); i++){
//                System.out.print(name.get(i).toString());
//            }
//            System.out.println();
//        }

        //tìm kiếm hoá đơn theo mã khách hàng
        String customerID = "cus03";
        for(Order key : map01.keySet()){
            if(key.getCustomerID().equals(customerID)){
                System.out.println("hoa don = " + key.getIdOrder());
                break;
            }
        }
    }
}
