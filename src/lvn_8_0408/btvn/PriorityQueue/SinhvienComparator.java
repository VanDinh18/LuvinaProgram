package lvn_8_0408.btvn.PriorityQueue;

import java.util.Comparator;

public class SinhvienComparator implements Comparator<Sinhvien> {
    @Override
    public int compare(Sinhvien t0, Sinhvien t1) {
        if(t0.getDiemtrungbinh() > t1.getDiemtrungbinh()){
            return 1;
        }
        else if(t0.getDiemtrungbinh() < t1.getDiemtrungbinh()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
