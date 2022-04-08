package OOP.B9_Exception2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class main_SoPhuc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SoPhuc sp1 = new SoPhuc();
        SoPhuc sp2 = new SoPhuc();
        boolean isTrue = false;
        do{
            System.out.println("Nhap phan thuc so phuc 1");
            sp1.phanThuc = in.nextByte();
            //isTrue = sp1.nhapgt();
            System.out.println("Nhap phan ao so phuc 1");
            sp1.phanAo = in.nextByte();
            System.out.println("Nhap phan thuc so phuc 2");
            sp2.phanThuc = in.nextByte();
            System.out.println("Nhap phan ao so phuc 2");
            sp2.phanAo = in.nextByte();
        }
        while (isTrue=true);

        TinhToanSoPhuc ttoanSP = TinhToanSoPhuc.getInstance();

        SoPhuc tong = ttoanSP.congSoPhuc(sp1,sp2);
        SoPhuc hieu = ttoanSP.truSoPhuc(sp1,sp2);
        SoPhuc nhan = ttoanSP.nhanSoPhuc(sp1,sp2);
        SoPhuc chia = ttoanSP.chiaSoPhuc(sp1,sp2);
    }
}
