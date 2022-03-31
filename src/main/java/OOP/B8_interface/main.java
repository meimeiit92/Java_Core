package OOP.B8_interface;

import java.util.*;

public class main {
    public static void main(String[] args) {
        ThanhVien tp1 = new ThanhVien();
        String diaChi ;
        Scanner in = new Scanner(System.in);
        // Nhap thong tin thanh vien tu ban phim
        System.out.println("Moi ban nhap dia chi cua ho dan");
        diaChi= in.nextLine();
        System.out.println("Moi ban nhap ten ");
        tp1.hoTen = in.nextLine();
        System.out.println("Moi ban nhap nghe nghiep ");
        tp1.ngheNghiep = in.nextLine();
        System.out.println("Moi ban nhap CCCD ");
        tp1.soCCCD = in.nextInt();
        System.out.println("Moi ban nhap tuoi");
        tp1.tuoi = in.nextInt();
        in.close();
        ThanhVien tp2 = new ThanhVien("Mei xinh", "IT", 30, 12345678);
        List<ThanhVien> lstThanhVien = new ArrayList<>(3){};
        lstThanhVien.add(tp1);
        lstThanhVien.add(tp2);

        HoDan hoDan1 = new HoDan(diaChi, lstThanhVien);
        HoDan hoDan2 = new HoDan("Minh Khai", lstThanhVien);
        List<HoDan> lstHoDan = new ArrayList<>(){};
        lstHoDan.add(hoDan1);
        lstHoDan.add(hoDan2);
        KhuPho kP = new KhuPho("Xinh tuoi", lstHoDan);
        kP.inKhuPho();
    // in ra thong tin cuar 1 ho dan theo so nha
        System.out.println(" in ra thong tin cua 1 ho dan theo dia chi");
        kP.inHoDanTheoDiaChi("Minh Khai");
        // in ra thong tin 1 nguoi theo so CMND
        for (HoDan hd : lstHoDan)
        {
            System.out.println("in ra thong tin 1 nguoi theo so CMND");
            hd.inThanhVienTheoCMND(12345678);
        }
    }
}
