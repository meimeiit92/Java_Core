package JUnit;

public class HinhTron implements HinhHoc2D{
    protected double banKinh;

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public Double tinhChuVi() {
        return Math.round(( 2*banKinh*Math.PI)*1000.0)/ (1000.0);
    }

    @Override
    public Double tinhDienTich() {
        return Math.round(( banKinh*banKinh*Math.PI)*1000.0)/ (1000.0);
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                "chuVi=" + banKinh +
                "dienTich=" + banKinh +
                '}';
    }
}
