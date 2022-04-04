package OOP.B9_Exception;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static OOP.B9_Exception.PhanSo.Hienthi;
import static OOP.B9_Exception.PhanSo.nhapPhanSo;

public class main {
    public static void main(String[] args) throws IOException {
        System.out.println("Moi ban nhap so luong phan so");

        Scanner in = new Scanner(System.in);
        int soLuong = in.nextInt();
        List<PhanSo> lstPS = new ArrayList<PhanSo>();
        for (int i=0;i<soLuong;i++)
        {
            PhanSo ps = new PhanSo();
            ps =  nhapPhanSo(i);
            Hienthi(ps);
            lstPS.add(ps);
        }
        TinhToan tt = new TinhToan();
        List<PhanSo> lstKQ = new ArrayList<PhanSo>();
        PhanSo congKQ = tt.congPhanSo(lstPS);
        PhanSo hieuKQ = tt.truPhanSo(lstPS);
        PhanSo tichKQ = tt.nhanPhanSo(lstPS);
        PhanSo thuongKQ = tt.chiaPhanSo(lstPS);
        lstKQ.add(congKQ);
        lstKQ.add(hieuKQ);
        lstKQ.add(tichKQ);
        lstKQ.add(thuongKQ);
        System.out.println("Ket qua cac phep tinh la: ");
        for (int i =0;i<lstKQ.size();i++){

            PhanSo.Hienthi(lstKQ.get(i));
        }
    }
}
