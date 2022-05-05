package JUnit;

public class HinhVuong implements HinhHoc2D{
    protected long canh;

    @Override
    public Integer tinhChuVi() {
        return 4*(int)canh;
    }

    @Override
    public Integer tinhDienTich() {
        return (int)canh*(int)canh;
    }
}
