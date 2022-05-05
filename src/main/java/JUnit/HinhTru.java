package JUnit;

public class HinhTru extends HinhTron implements HinhHoc3D{
    private double chieuCao;
    private HinhTron hinhTron;

    public HinhTru(double banKinh, double chieuCao, HinhTron hinhTron) {
        super(banKinh);
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
