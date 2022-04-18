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
        List<Diem> lstDiemSV = new ArrayList<>();
        SinhVien sv1 = new SinhVien("1", "Mei1", "11/1/1992", "ND");
        lstSinhVien.add(sv1);
        lstMonHoc.add(new MonHoc("1","Toan"));
        lstDiemSV.add(new Diem("1","1",10));
        switch (input) {
            case 1:
                System.out.println("In ra danh sach sinh vien");
                for (SinhVien sv : lstSinhVien) {
                    System.out.println(sv.toString());
                }
                break;
            case 2:
                System.out.println("Them moi thong tin");
                SinhVien sv2 = new SinhVien();
                do{
                    System.out.println("Nhap ma sinh vien");
                    boolean isRight = true;
                    sv2.setMaSV(in.next());
                    for (int i = 0; i < lstSinhVien.size(); i++) {
                        if (sv2.getMaSV().equals(lstSinhVien.get(i).getMaSV()) ) {
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
                sv2.setTenSV(in.next());
                System.out.println("Nhap ngay sinh");
                sv2.setNgaySinh(in.next());
                System.out.println("Nhap que quan");
                sv2.setQueQuan(in.next());
                lstSinhVien.add(sv2);
                break;
            case 3:
                SinhVien sv3 = new SinhVien();
                System.out.println("Nhap ID sinh vien can tim kiem");
                String id1 = in.next();
                int count = 0;
                for (int i = 0; i < lstSinhVien.size(); i++) {
                    if (id1 == lstSinhVien.get(i).getMaSV()) {
                        sv3 = lstSinhVien.get(i);
                        count = count + 1;
                    }
                }
                if(count ==0){
                    System.out.println("Khong tim thay sinh vien nao co ID =" +id1);
                }
                else {
                    System.out.println("Sinh vien tim thay co ID = "+id1);
                    sv3.toString();
                }
                break;
            case 4:
                System.out.println("In ra danh sach mon hoc");
                for (MonHoc mh : lstMonHoc) {
                    System.out.println(mh.toString());
                }
                break;


            case 5:
                int countMH = 0;
                do{
                    System.out.println("Nhap ma mon hoc moi");
                    MonHoc MH = new MonHoc();
                    String maMonHoc = in.next();
                    for(int i =0; i<lstMonHoc.size();i++){
                        if(maMonHoc.equals(lstMonHoc.get(i).getMaMH()) ){
                            System.out.println("Ma mon hoc bi trung. Moi ban nhap lai");
                        }
                        else {
                            countMH = countMH+1;
                            MH.setMaMH(maMonHoc);
                            break;
                        }
                    }
                    System.out.println("Nhap ten mon hoc moi");
                    MH.setTenMH(in.next());
                    lstMonHoc.add(MH);

                }
                while (countMH==0);
            case 6:
                System.out.println("Nhap ma sinh vien muon nhap diem");
                String maSV = in.next();
                for (int i = 0; i < lstSinhVien.size(); i++) {
                    if (maSV.equals(lstSinhVien.get(i).getMaSV())) {
                        System.out.println("Nhap mon hoc muon nhap diem");
                        String maMonHoc = in.next();
                        for(int j=0; j<lstMonHoc.size();j++){
                            if(maMonHoc.equals(lstMonHoc.get(j).getMaMH())){
                                System.out.println("Nhap diem");
                                do{
                                    int diem = in.nextInt();
                                    if(diem >=0 && diem <= 10){
                                        lstDiemSV.add(new Diem(maSV,maMonHoc,diem));
                                    }
                                    break;
                                }
                              while (true);

                            }
                        }
                    }
                }
            case 7:
                System.out.println("Nhap ma sinh vien muon cap nhat diem");
                String maSV1 = in.next();
                for (int i = 0; i < lstSinhVien.size(); i++) {
                    if (maSV1.equals(lstSinhVien.get(i).getMaSV())) {
                        System.out.println("Nhap mon hoc muon cap nhat diem");
                        String maMonHoc1 = in.next();
                        for(int j=0; j<lstMonHoc.size();j++){
                            if(maMonHoc1.equals(lstMonHoc.get(j).getMaMH())){
                                System.out.println("Nhap diem");
                                do{
                                    int diem = in.nextInt();
                                    if(diem >=0 && diem <= 10){
                                        for(int k =0;k<lstDiemSV.size();k++){
                                            if(maSV1.equals(lstDiemSV.get(k).getMaSV())&& maMonHoc1.equals(lstDiemSV.get(k).getMaMH())){
                                                lstDiemSV.set(k,new Diem(maSV1,maMonHoc1,diem));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                                while (true);
                            }
                        }
                    }
                }
                for(int l=0;l<lstDiemSV.size();l++){
                    System.out.println(lstDiemSV.get(l).toString());
                    break;

            }
            case 8:
                System.out.println("Nhap ID sinh vien can tim kiem");
                String maSV2 = in.next();
                int count2=0;
                for (int i = 0; i < lstSinhVien.size(); i++) {
                    if (maSV2 == lstSinhVien.get(i).getMaSV()) {
                        sv3 = lstSinhVien.get(i);
                        count2 = count2 + 1;
                    }
                }
                if(count2 ==0){
                    System.out.println("Khong tim thay sinh vien nao co ID =" +maSV2);
                }
                else {
                    System.out.println("Sinh vien tim thay co ID = "+maSV2);
                    for(int i =0; i<lstDiemSV.size();i++){
                        //if(maSV2.equals(lstDiemSV.get()))
                    }
                }
            case 9:
            case 10:

        }
    }

}
