package lvn_2_1407.btvn;

public class fix_bai1 {
    public static void main(String[] args) {
        int[] a = {10, 1, 10, 2, 3, 5, 10, 8, 9, 2, 10};
        int dem = 1, max, i;
        max = a[a.length-1];
        int[] b = new int[a.length];
        b[0] = a.length-1;
        i = 0;
        while (i < a.length - 1) {
            if (max < a[i]) {
                max = a[i];
                dem = 1;
                b[0] = i;
            }
            else if (max == a[i]) {
                dem++;
                b[dem-1] = i;
            }
            i++;
        }
        System.out.println(dem);
        System.out.println(max);
        if (dem == 1) {
            System.out.println("Số lớn nhất là: " + max);
        } else {
            for(int j=0; j<dem; j++){
                System.out.print(b[j] + "-");
            }
        }
    }
}
