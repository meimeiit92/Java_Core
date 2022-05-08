package JUnit.BTVN;

public class HinhVuong implements HinhHoc2D<Integer>{
    protected long canh;

    public long getCanh() {
        return canh;
    }

    public void setCanh(long canh) {
        if(canh<=0) throw  new RuntimeException("Canh phai duong");
        this.canh = canh;
    }

    public HinhVuong(long canh) {
        if(canh<=0) throw  new RuntimeException("Canh phai duong");
        this.canh = canh;
    }

    public HinhVuong() {
    }

    @Override
    public Integer tinhChuVi() {
        return 4*(int)canh;
    }

    @Override
    public Integer tinhDienTich() {
        return (int)canh*(int)canh;
    }
}
