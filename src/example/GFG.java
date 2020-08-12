package example;

public class GFG
{
    //hàm tìm các giá trị của đa thức sau khi A*B
    public static int[] multiply(int A[], int B[], int m, int n) {
        //m là bậc của A, n là bậc của B
        //bậc của đa thức A*B là m+n, suy ra mảng prod có m+n-1 phần tử
        int[] prod = new int[m + n - 1];
        //gán tất cả các giá trị của mảng bằng 0
        for (int i = 0; i < m + n - 1; i++) {
            prod[i] = 0;
        }
        // vòng for tính tích đa thức
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                prod[i + j] += A[i] * B[j];
            }
        }
        return prod;
    }
    //hàm in ra da thức thôi, không cần quan tâm đâu
    public static void printPoly(int poly[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(poly[i]);
            if (i != 0) {
                System.out.print("x^" + i);
            }
            if (i != n - 1) {
                System.out.print(" + ");
            }
        }
    }
    //giống hàm main trong C++
    public static void main(String[] args)
    {
        int A[] = {5, 0, 10, 6};
        int B[] = {1, 2, 4};
        int m = A.length;//lấy bậc của mảng A
        int n = B.length;
        System.out.println("First polynomial is n");
        printPoly(A, m);
        System.out.println("\nSecond polynomial is n");
        printPoly(B, n);
        //truyền tham số vào hàm
        int[] prod = multiply(A, B, m, n);

        System.out.println("\nProduct polynomial is n");
        //in ra mảng A*B
        printPoly(prod, m + n - 1);
    }
}
