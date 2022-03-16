package OOP;

public class Bai2_SinhVien {
    private int maSinhVien;
    private String hoVaTen;
    private float diemLT, diemTH, diemTrungBinh;

    public  Bai2_SinhVien(){};
    public Bai2_SinhVien(int maSinhVien, String hoVaTen, float diemLT, float diemTH){
        if(maSinhVien>0 && diemLT >=0 & diemTH>=0){
            this.maSinhVien = maSinhVien;
            this.diemLT = diemLT;
            this.diemTH = diemTH;
        }
        this.hoVaTen = hoVaTen;
        diemTrungBinh = (this.diemLT + this.diemTH)/2;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }
    public float tinhDiemTrungBinh()
    {
        diemTrungBinh = (diemTH+diemLT)/2;
        return diemTrungBinh;
    }
    public  void  inSinhVien()
    {
        System.out.printf("Sinh vien %s co ma sinh vien la %d co diem thu hanh la %f diem ly thuyet la %f tong diem trung binh la %f \n", hoVaTen, maSinhVien,diemLT,diemTH, diemTrungBinh);
    }
    public void inSV() {
        System.out.printf("%6d %-18s %10.2f %12.2f %12.2f \n", maSinhVien, hoVaTen, diemLT, diemTH, diemTrungBinh);
    }
}
