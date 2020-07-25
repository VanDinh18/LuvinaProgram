package lvn_5_2307.btvn;

import java.util.Scanner;

public class ComplexNumber {

    private int realPart;
    private int virtualPart;

    public ComplexNumber(){
        realPart = 0;
        virtualPart = 1;
    }

    public ComplexNumber(int realPart, int virtualPart) {
        this.realPart = realPart;
        this.virtualPart = virtualPart;
    }

    public ComplexNumber(ComplexNumber x) {
        this.realPart = x.getRealPart();
        this.virtualPart = x.getVirtualPart();
    }

    public int getRealPart() {
        return realPart;
    }

    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }

    public int getVirtualPart() {
        return virtualPart;
    }

    public void setVirtualPart(int virtualPart) {
        this.virtualPart = virtualPart;
    }

    public void enterData(){
        int realPart;
        int virtualPart;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan thuc: ");
        realPart = sc.nextInt();
        System.out.print("Nhap phan ao: ");
        virtualPart = sc.nextInt();
        setRealPart(realPart);
        setVirtualPart(virtualPart);
    }

    public ComplexNumber plusComplexNumber(ComplexNumber x){
        int realPath = this.getRealPart() + x.getRealPart();
        int virtual = this.getVirtualPart() + x.getVirtualPart();
        return new ComplexNumber(realPath, virtual);
    }

    public static ComplexNumber plusComplexNumber(ComplexNumber x, ComplexNumber y){
        int realPath = x.getRealPart() + y.getRealPart();
        int virtual = x.getVirtualPart() + y.getVirtualPart();
        return new ComplexNumber(realPath, virtual);
    }

    public ComplexNumber minusComplexNumber(ComplexNumber x){
        int realPath = this.getRealPart() - x.getRealPart();
        int virtual = this.getVirtualPart() - x.getVirtualPart();
        return new ComplexNumber(realPath, virtual);
    }
    public static ComplexNumber minusComplexNumber(ComplexNumber x, ComplexNumber y){
        int realPath = x.getRealPart() - y.getRealPart();
        int virtual = x.getVirtualPart() - y.getVirtualPart();
        return new ComplexNumber(realPath, virtual);
    }

    public ComplexNumber multiplyComplexNumber(ComplexNumber x){
        int realPath = (this.getRealPart() * x.getRealPart()) - (this.getVirtualPart() * x.getVirtualPart());
        int virtual = (this.getRealPart() * x.getVirtualPart()) + (x.getRealPart() * this.getVirtualPart());
        return new ComplexNumber(realPath, virtual);
    }

    public static ComplexNumber multiplyComplexNumber(ComplexNumber x, ComplexNumber y){
        int realPath = (x.getRealPart() * y.getRealPart()) - (x.getVirtualPart() * y.getVirtualPart());
        int virtual = (x.getRealPart() * y.getVirtualPart()) + (y.getRealPart() * x.getVirtualPart());
        return new ComplexNumber(realPath, virtual);
    }

    public static void main(String[] args) {
//        ComplexNumber complexNumber = new ComplexNumber();
//        complexNumber.enterData();

        ComplexNumber a = new ComplexNumber(1, 3);
        ComplexNumber b = new ComplexNumber(4, 7);
        ComplexNumber c = plusComplexNumber(b, a);
    }
}
