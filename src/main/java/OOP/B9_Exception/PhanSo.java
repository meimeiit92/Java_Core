package OOP.B9_Exception;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PhanSo {
    private int tuSo, mauSo;

    public PhanSo(int tuSo, int mauSo) {
        super();
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo() {

    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public boolean kiemTraPhanSo(int tuso, int mauSo)
    {
        if(mauSo == 0) {
            System.out.println("Mau so phai khac 0");
            return  false;
        }
        try {

            Integer.parseInt(String.valueOf(tuso));
            Integer.parseInt(String.valueOf(tuso));
            return true;
        }
        catch(NumberFormatException e) {
            System.out.println("Ban khong duoc nhap chuoi");
        }
        return  true;
    }
    static int nhapgt(){
        Scanner in = new Scanner(System.in);
        String str;
        boolean isInteger = false;
        int so  = 0;
        while (!isInteger) {
            try {
                str = in.nextLine();
                so = Integer.valueOf(str).intValue();
                isInteger = true;
            } catch (NumberFormatException ex) {
                System.out.println("Ban phai nhap so nguyen. Moi ban nhap lai");
            }
        }
        return so;
    }
    static  PhanSo nhapPhanSo(int x) throws IOException{
        int tu,mau;
        System.out.println("Nhap phan so thu: " +x);
        System.out.print("Tu so: ");
        tu = nhapgt();
        System.out.print("Mau so: ");
        do{
            mau=nhapgt();
            if(mau==0) System.out.print("Nhap lai mau so");
        }while(mau==0);
        PhanSo ps = new PhanSo(tu,mau);
        return ps;
    }
    static int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    static PhanSo toiGianPhanSo(PhanSo ps){
        PhanSo phanso = new PhanSo();
        phanso.tuSo = ps.tuSo/timUSCLN(Math.abs(ps.tuSo),Math.abs(ps.mauSo));
        phanso.mauSo = ps.mauSo/timUSCLN(Math.abs(ps.tuSo),Math.abs(ps.mauSo));
        return phanso;
    }
    static PhanSo tong(PhanSo ps1, PhanSo ps2){
        PhanSo phanso = new PhanSo();
        phanso.tuSo= ps1.tuSo*ps2.mauSo + ps2.tuSo*ps1.mauSo;
        phanso.mauSo= ps1.mauSo*ps2.mauSo;
        if(phanso.tuSo!=0)
            phanso=toiGianPhanSo(phanso);
        return phanso;
    }
    static PhanSo hieu(PhanSo ps1, PhanSo ps2){
        PhanSo phanso = new PhanSo();
        phanso.tuSo = ps1.tuSo*ps2.mauSo - ps2.tuSo*ps1.mauSo;
        phanso.mauSo = ps1.mauSo*ps2.mauSo;
        if(phanso.mauSo!=0)
            phanso = toiGianPhanSo(phanso);
        return phanso;
    }
    static PhanSo tich(PhanSo ps1, PhanSo ps2){
        PhanSo phanso = new PhanSo();
        phanso.tuSo = ps1.tuSo*ps2.tuSo;
        phanso.mauSo = ps1.mauSo*ps2.mauSo;
        if(phanso.tuSo!=0)
            phanso = toiGianPhanSo(phanso);
        return phanso;
    }
    static PhanSo thuong(PhanSo ps1,PhanSo ps2){
        PhanSo phanso=new PhanSo();
        phanso.tuSo = ps1.tuSo*ps2.mauSo;
        phanso.mauSo = ps1.mauSo*ps2.tuSo;
        if(phanso.tuSo!=0)
            phanso=toiGianPhanSo(phanso);
        return phanso;
    }
    static void Hienthi(PhanSo ps){
        if(ps.tuSo==0 || ps.mauSo==1) System.out.print(ps.tuSo);
        else {
            System.out.println(ps.tuSo+"/"+ps.mauSo );
            System.out.printf("\n");
        }
    }
}
