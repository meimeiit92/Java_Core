package OOP.truuTuong.ThayHuy;

import java.util.Scanner;

public class Bai1_Main {
    public static void main(String[] args)
    {
        double chieuDai, chieuRong, chuVi, dienTich;
        Scanner in = new Scanner(System.in);
        System.out.println("Moi ban nhap vao chieu dai");
        chieuDai= in.nextDouble();
        System.out.println("Moi ban nhap vao chieu rong");
        chieuRong= in.nextDouble();
        Bai1_HCN hcn = new Bai1_HCN ();
        hcn.setHcn(chieuDai,chieuRong);
        chuVi = hcn.chuVi();
        dienTich = hcn.dienTich();
        hcn.toStringHcn();
    }
}
