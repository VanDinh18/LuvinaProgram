package lvn_10_1008.btvn;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //quản lý người mua bán cổ phiếu
        Map<String, Stock> nguoimuaban = new TreeMap<>();
        //quản lý cổ phiếu sử dụng
        Map<String, Stock> cophieu = new HashMap<>();
        //quản lý đặt bán một cổ phiếu
        Queue<TradeOrder> sellOrder = new PriorityQueue<>(new Comparator<TradeOrder>() {
            @Override
            public int compare(TradeOrder to1, TradeOrder to2) {
                return to1.getOrderID().compareTo(to2.getOrderID());
            }
        });
        //quản lý đặt mua một cổ phiếu
        Queue<TradeOrder> buyOrder = new PriorityQueue<>(new Comparator<TradeOrder>() {
            @Override
            public int compare(TradeOrder to1, TradeOrder to2) {
                return to1.getOrderID().compareTo(to2.getOrderID());
            }
        });
    }
}
