package lvn_8_0408.btvn.PriorityQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Sinhvien> queue = new PriorityQueue<>(new SinhvienComparator());
        queue.add(new Sinhvien("dinh", "18/02/99", "nam dinh", "cntt", 2.8, "b1"));
        queue.add(new Sinhvien("phuong", "18/02/99", "ha noi", "cntt", 3.0, "b1"));
        queue.add(new Sinhvien("lan", "18/02/99", "ninh binh", "cntt", 2.2, "b1"));
        queue.add(new Sinhvien("mai", "18/02/99", "bac giang", "cntt", 2.5, "b1"));
        queue.add(new Sinhvien("tham", "18/02/99", "ho chi minh", "cntt", 2.9, "b1"));
        queue.add(new Sinhvien("duong", "18/02/99", "quang nam", "cntt", 3.8, "b1"));
        queue.add(new Sinhvien("dai", "18/02/99", "da nang", "cntt", 3.5, "b1"));

        while (!queue.isEmpty()){
            System.out.println(queue.poll().toString());
        }
    }
}
