package JUnit.BTVN;

public class HinhTru implements HinhHoc3D<Double>{
    private double chieuCao;
    private HinhTron hinhTron;

    public HinhTru() {
    }

    public void setChieuCao(double chieuCao) {
        if (chieuCao <=0) throw new RuntimeException("Chieu cao phai duong");
        this.chieuCao = chieuCao;
    }

    public void setHinhTron(HinhTron hinhTron) {
        this.hinhTron = hinhTron;
    }

    public HinhTru(double chieuCao, HinhTron hinhTron) {
        if(chieuCao<=0) throw new RuntimeException("Chieu cao phai duong");
        this.chieuCao = chieuCao;
        this.hinhTron = hinhTron;
    }

    @Override
    public Double tinhTheTich() {
        return Math.round((hinhTron.tinhDienTich()*chieuCao)*1000.0)/ (1000.0);
    }

    public Double dienTichXungQuanh(){
        return Math.round((hinhTron.tinhChuVi()*chieuCao)*1000.0)/ (1000.0);
    }

    public  Double dienTichToanPhan (){
        return Math.round(( hinhTron.tinhChuVi()*(hinhTron.banKinh + chieuCao))*1000.0)/ (1000.0);
    }
}
