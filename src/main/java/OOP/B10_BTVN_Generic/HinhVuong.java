package OOP.B10_BTVN_Generic;

public class HinhVuong implements IHinhHoc{
    private double canhHV;

    public HinhVuong(double canhHV) {
        this.canhHV = canhHV;
    }

    public HinhVuong() {
    }

    public void setCanhHV(double canhHV) {
        this.canhHV = canhHV;
    }

    public double getCanhHV() {
        return canhHV;
    }

    @Override
    public double tinhChuVi() {
        return canhHV*canhHV;
    }

    @Override
    public double tinhDienTich() {
        return 4*canhHV;
    }

    public String toString(){
        System.out.println("Chu vi hinh vuong la " + tinhChuVi() + "Dien tich hinh vuong la " + tinhDienTich());
        return  "Hinh vuong ";
    }
}
