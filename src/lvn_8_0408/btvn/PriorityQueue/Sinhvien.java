package lvn_8_0408.btvn.PriorityQueue;

public class Sinhvien{

    private String hoten;
    private String ngaysinh;
    private String quequan;
    private String nganhhoc;
    private double diemtrungbinh;
    private String tienganh;

    public Sinhvien(String hoten, String ngaysinh, String quequan, String nganhhoc, double diemtrungbinh, String tienganh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
        this.nganhhoc = nganhhoc;
        this.diemtrungbinh = diemtrungbinh;
        this.tienganh = tienganh;
    }

    @Override
    public String toString(){
        return hoten + "\t" + ngaysinh + "\t" + quequan + "\t" + nganhhoc + "\t" + diemtrungbinh + "\t" + tienganh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getNganhhoc() {
        return nganhhoc;
    }

    public void setNganhhoc(String nganhhoc) {
        this.nganhhoc = nganhhoc;
    }

    public double getDiemtrungbinh() {
        return diemtrungbinh;
    }

    public void setDiemtrungbinh(double diemtrungbinh) {
        this.diemtrungbinh = diemtrungbinh;
    }

    public String getTienganh() {
        return tienganh;
    }

    public void setTienganh(String tienganh) {
        this.tienganh = tienganh;
    }

}
