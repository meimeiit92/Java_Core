package OOP.B9_Exception;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static OOP.B9_Exception.PhanSo.Hienthi;
import static OOP.B9_Exception.PhanSo.nhapPhanSo;

public class main {
    public static void main(String[] args) throws IOException {
        System.out.printf("Moi ban lua chon \n 1 la cong 3 phan so \n 2 la hieu 3 phan so \n 3 la tich 2 phan so \n 4 la thuong 2 phan so \n");

        Scanner in = new Scanner(System.in);
        int yourOption ;
        do{
            yourOption = PhanSo.nhapgt();
            if(yourOption!=1 && yourOption!=2 && yourOption!=3 && yourOption!=4) {
                System.out.println("Moi ban nhap lai. Ban phai chon 1 hoac 2 hoac 3 hoac 4");
            }
        }
        while (yourOption!=1 && yourOption!=2 && yourOption!=3 && yourOption!=4);

        List<PhanSo> lstPS = new ArrayList<PhanSo>();
        List<PhanSo> lst2PS = new ArrayList<PhanSo>();
        for (int i=0;i<2;i++)
        {
            PhanSo ps = new PhanSo();
            ps =  nhapPhanSo(i);
            Hienthi(ps);
            lstPS.add(ps);
        }
        if(yourOption ==1 || yourOption ==2){
            PhanSo ps = new PhanSo();
            ps =  nhapPhanSo(2);
            Hienthi(ps);
            lstPS.add(ps);

        }
        TinhToan tt = new TinhToan();
        List<PhanSo> lstKQ = new ArrayList<PhanSo>();
        switch (yourOption){
            case 1:
                PhanSo congKQ = tt.congPhanSo(lstPS);
                lstKQ.add(congKQ);
            case 2:
                PhanSo hieuKQ = tt.truPhanSo(lstPS);
                lstKQ.add(hieuKQ);
            case 3:
                PhanSo tichKQ = tt.nhanPhanSo(lstPS);
                lstKQ.add(tichKQ);
            case 4:
                PhanSo thuongKQ = tt.chiaPhanSo(lstPS);
                lstKQ.add(thuongKQ);
        }

        System.out.println("Ket qua cac phep tinh la: ");
        for (int i =0;i<lstKQ.size();i++){

            PhanSo.Hienthi(lstKQ.get(i));
        }
    }
}
