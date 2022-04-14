package OOP.B10_BTVN_Generic;

public class HinhTron implements IHinhHoc{
    private double banKinh;

    public double getBanhKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron() {
    }

    @Override
    public double tinhChuVi() {
        return 2*banKinh*Math.PI;
    }

    @Override
    public double tinhDienTich() {
        return banKinh*banKinh*Math.PI;
    }
    public String toString(){
        System.out.println("Chu vi hinh tron la " + tinhChuVi() + "Dien tich hinh tron la " + tinhDienTich());
        return "Hinh tron ";
    }
}
