package OOP.B8_interface;

import java.util.List;

public class HoDan {
    String diaChi;
    List<ThanhVien> lstThanhVien;

    public String getDiaChi() {
        return diaChi;
    }

    public List<ThanhVien> getLstThanhVien() {
        return lstThanhVien;
    }

    public void setDiachi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setLstThanhVien(List<ThanhVien> lstThanhVien) {
        this.lstThanhVien = lstThanhVien;
    }

    public HoDan(String diaChi, List<ThanhVien> lstThanhVien) {
        this.diaChi = diaChi;
        this.lstThanhVien = lstThanhVien;
    }
    public void inHoDan(){
        System.out.println("Ho dan o dia chi "+diaChi + " co "+ lstThanhVien.stream().count() + " thanh vien");
        System.out.printf("%6s %5s %20s %10s \n","Ho Ten","Tuoi","Nghe Nghiep","CCCD");
        for (ThanhVien tp : lstThanhVien )
        {
            System.out.printf("%6s %5s %20s %10s \n",  tp.hoTen, tp.tuoi, tp.ngheNghiep, tp.soCCCD);
        }
    }
    public void inThanhVienTheoCMND(int CMND)
    {
        for (ThanhVien tp : lstThanhVien)
        {
            if(tp.soCCCD==  CMND){
                System.out.printf("%6s %5s %20s %10s \n",  tp.hoTen, tp.tuoi, tp.ngheNghiep, tp.soCCCD);
            }
        }
    }

}
