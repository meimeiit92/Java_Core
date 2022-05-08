package JUnit.BTVN;

public class HinhTron implements HinhHoc2D<Double>{
    protected double banKinh;

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if(banKinh<=0) throw new RuntimeException("Ban kinh khong hop le");
        this.banKinh = banKinh;
    }

    public HinhTron(double banKinh) {
        if(banKinh<=0) throw new RuntimeException("Ban kinh khong hop le");
        this.banKinh = banKinh;
    }

    public HinhTron() {
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
