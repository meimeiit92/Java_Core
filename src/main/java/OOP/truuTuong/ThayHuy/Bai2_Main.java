package OOP.truuTuong.ThayHuy;

import java.util.Scanner;

public class Bai2_Main {
    public static void main(String[] args)
    {
        int maSV; String tenSV; float diemTH, diemLT;
        Bai2_SinhVien sv1 = new Bai2_SinhVien(1,"sv1", 2,3);
        Bai2_SinhVien sv2 = new Bai2_SinhVien(2,"sv2", 5,7);
        Bai2_SinhVien sv3 = new Bai2_SinhVien();
        Scanner in = new Scanner(System.in);
        System.out.println("Moi ban nhap ma sinh vien");
        maSV = in.nextInt();
        System.out.println("Moi ban nhap ho va ten sinh vien");
        tenSV = in.next();
        System.out.println("Moi ban nhap diem ly thuyet");
        diemLT = in.nextFloat();
        System.out.println("Moi ban nhap diem thuc hanh");
        diemTH = in.nextFloat();
        sv3.setMaSinhVien(maSV);
        sv3.setHoVaTen(tenSV);
        sv3.setDiemLT(diemLT);
        sv3.setDiemTH(diemTH);
        sv3.getMaSinhVien();
        sv3.getHoVaTen();
        sv3.getDiemLT();
        sv3.getDiemTH();sv3.tinhDiemTrungBinh();
        System.out.printf("%6s %5s %20s %10s %10s \n","Mã","Họ tên","Điểm lý thuyết","Điểm thực hành","Điểm trung bình");
        sv1.inSV();
        sv2.inSV();
        sv3.inSV();
        System.out.println("--------------------------end-----------------------------");
        sv3.inSinhVien();


    }
}
