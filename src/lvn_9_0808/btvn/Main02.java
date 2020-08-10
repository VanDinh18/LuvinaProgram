package lvn_9_0808.btvn;

import java.util.*;

public class Main02 {
    public static void main(String[] args) {
        Map<Supplier, TreeMap<Purchase, ArrayList<PurchaseDetail>>> map01 = new HashMap<>();

        Supplier supplier01 = new Supplier("no1", "dell", "HN", "09866");
        Calendar calendar011 = Calendar.getInstance();
        calendar011.set(Calendar.YEAR, 2020);
        calendar011.set(Calendar.MONTH, 9);
        calendar011.set(Calendar.DATE, 22);
        Date date011 = calendar011.getTime();
        Purchase purchase011 = new Purchase(11, date011, "no11");
        List<PurchaseDetail> list011 = new ArrayList<>();
        list011.add(new PurchaseDetail(11, 100, 1000, 20, 200));
        list011.add(new PurchaseDetail(11, 101, 1001, 30, 10));
        list011.add(new PurchaseDetail(11, 102, 1002, 10, 40));
        Map<Purchase, ArrayList<PurchaseDetail>> treemap01 = new TreeMap<>();
        treemap01.put(purchase011, (ArrayList<PurchaseDetail>) list011);
        Calendar calendar012 = Calendar.getInstance();
        calendar012.set(Calendar.YEAR, 2018);
        calendar012.set(Calendar.MONTH, 3);
        calendar012.set(Calendar.DATE, 2);
        Date date012 = calendar012.getTime();
        Purchase purchase012 = new Purchase(12, date012, "no12");
        List<PurchaseDetail> list012 = new ArrayList<>();
        list012.add(new PurchaseDetail(12, 102, 1002, 30, 100));
        list012.add(new PurchaseDetail(12, 103, 1003, 10, 200));
        treemap01.put(purchase012, (ArrayList<PurchaseDetail>) list012);
        map01.put(supplier01, (TreeMap<Purchase, ArrayList<PurchaseDetail>>) treemap01);

        Supplier supplier02 = new Supplier("no2", "hp", "ND", "0123456");
        Calendar calendar02 = Calendar.getInstance();
        calendar02.set(Calendar.YEAR, 2019);
        calendar02.set(Calendar.MONTH, 5);
        calendar02.set(Calendar.DATE, 18);
        Date date02 = calendar011.getTime();
        Purchase purchase02 = new Purchase(2, date02, "no2");
        List<PurchaseDetail> list02 = new ArrayList<>();
        list02.add(new PurchaseDetail(2, 200, 2000, 30, 10));
        list02.add(new PurchaseDetail(2, 201, 2001, 20, 20));
        Map<Purchase, ArrayList<PurchaseDetail>> treemap02 = new TreeMap<>();
        treemap02.put(purchase02, (ArrayList<PurchaseDetail>) list02);

        map01.put(supplier02, (TreeMap<Purchase, ArrayList<PurchaseDetail>>) treemap02);

        String supplierID = "no2";
        for(Supplier keyS : map01.keySet()){
            Map<Purchase, ArrayList<PurchaseDetail>> value = map01.get(keyS);
            for(Purchase keyP : value.keySet()){
                if(keyP.getSupplierID().equals(supplierID)){
                    System.out.println("ma don nhap hang = " + keyP.getIdPurchase());
                    break;
                }
            }
        }
    }
}
