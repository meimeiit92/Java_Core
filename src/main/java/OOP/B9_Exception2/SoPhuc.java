package OOP.B9_Exception2;

import java.util.Scanner;

public class SoPhuc {
    double phanThuc, phanAo;

    public double getPhanThuc() {
        return phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public SoPhuc() {
    }
    public boolean nhapgt(String input){
        boolean isInteger = false;
        double result  = 0;
        while (!isInteger) {
            try {
                result = Double.parseDouble(input);
                isInteger = true;
            } catch (NumberFormatException ex) {
                System.out.println("Ban phai nhap so double. Moi ban nhap lai");
            }
        }
        return isInteger;
    }
    public SoPhuc congSP(SoPhuc sp2) {
        phanThuc = phanThuc + sp2.phanThuc;
        phanAo = phanAo + sp2.phanAo;
        return this;
    }

    // Ham tru 2 so phuc
    public SoPhuc truSP(SoPhuc sp2) {
        phanThuc = phanThuc - sp2.phanThuc;
        phanAo = phanAo - sp2.phanAo;
        return this;
    }

    // Ham nhan 2 so phuc
    public SoPhuc nhanSP(SoPhuc sp2) {
        phanThuc = phanThuc * sp2.phanThuc - phanAo * sp2.phanAo;
        phanAo = phanThuc * sp2.phanAo + sp2.phanThuc * phanAo;
        return this;
    }

    // Ham chia 2 so phuc
    public SoPhuc chiaSP(SoPhuc sp2) {
        phanThuc = (phanThuc * sp2.phanThuc + phanAo * sp2.phanAo) / (sp2.phanThuc * sp2.phanThuc + sp2.phanAo * sp2.phanAo);
        phanAo = (sp2.phanThuc * phanAo - phanThuc * sp2.phanAo) / (sp2.phanThuc * sp2.phanThuc + sp2.phanAo * sp2.phanAo);
        return this;
    }
    public void hienThi(){
        System.out.println("So phuc co phan thuc la "+ this.phanThuc + "phan ao la " + this.phanAo);
    }
}
