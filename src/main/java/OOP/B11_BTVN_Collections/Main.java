package OOP.B11_BTVN_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        System.out.println("1. In ra danh sach SV\n 2. Nhap thong tin SV moi\n 3. Tim kiem sinh vien theo ID\n 4. Danh sach mon hoc\n 5. Nhap thong tin mon hoc moi\n" +
                "6. Nhap diem mon hoc cho sinh vien\n 7. Cap nhat diem cho SV\n 8. Xem diem sinh vien theo ID\n 9. In ra danh sach sinh vien theo ma mon hoc\n 10. In ra sinh vien co diem trung binh tat ca cacs mon cao nhat");
        input = in.nextInt();
        List<SinhVien> lstSinhVien = new ArrayList<>();
        List<MonHoc> lstMonHoc = new ArrayList<>();
        SinhVien sv1 = new SinhVien("1", "Mei1", "11/1/1992", "ND");
        lstSinhVien.add(sv1);

        switch (input) {
            case 1:
                System.out.println("In ra danh sach sinh vien");
                for (SinhVien sv : lstSinhVien) {
                    System.out.println(sv.toString());
                }
            case 2:
                System.out.println("Them moi thong tin");
                SinhVien sv2 = new SinhVien();
                System.out.println("Nhap ma sinh vien");

                do{
                    String id = in.nextLine();
                    boolean isRight = true;

                    sv2.setMaSV(id);
                    for (int i = 0; i < lstSinhVien.size(); i++) {
                        if (sv2.getMaSV() == lstSinhVien.get(i).getMaSV()) {
                            System.out.println("Nhap lai ma SV");
                            isRight = false;
                            break;
                        }
                    }
                    if (isRight == false) {
                        continue;
                    }
                    break;
                }
                while (true);

                System.out.println("Nhap ten sinh vien");
                sv2.setTenSV(in.nextLine());
                System.out.println("Nhap ngay sinh");
                sv2.setNgaySinh(in.nextLine());
                System.out.println("Nhap que quan");
                sv2.setQueQuan(in.nextLine());
                lstSinhVien.add(sv2);
            case 3:
                List<SinhVien> lstTimKiem = new ArrayList<>();
                System.out.println("Nhap ID can tim kiem");
                String id1 = in.nextLine();
                int count = 0;
                for (int i = 0; i < lstSinhVien.size(); i++) {
                    if (id1 == lstSinhVien.get(i).getMaSV()) {
                        lstTimKiem.add(lstSinhVien.get(i));
                        count = count + 1;
                    }
                }
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:

        }
    }

}
