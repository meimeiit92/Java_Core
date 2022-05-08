package JUnit.TrenLop;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        if(chieuDai<=0|| chieuRong <= 0){
            throw new RuntimeException("Khong the tao doi tuong");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai <= 0) throw new RuntimeException("Canh phai duong");
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong <= 0) throw new RuntimeException("Canh phai duong");
        this.chieuRong = chieuRong;
    }
    public double tinhChuVi(){
        return (chieuRong + chieuDai) *2;
    }
    public double tinhDienTich(){
        return chieuDai*chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
