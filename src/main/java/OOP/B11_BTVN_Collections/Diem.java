package OOP.B11_BTVN_Collections;

public class Diem {
    String maSV, maMH;
    int diemSo;

    public Diem(String maSV, String maMH, int diemSo) {
        this.maSV = maSV;
        this.maMH = maMH;
        this.diemSo = diemSo;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public void setDiemSo(int diemSo) {
        this.diemSo = diemSo;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getMaMH() {
        return maMH;
    }

    public int getDiemSo() {
        return diemSo;
    }

    @Override
    public String toString() {
        return "Diem{" +
                "maSV='" + maSV + '\'' +
                ", maMH='" + maMH + '\'' +
                ", diemSo=" + diemSo +
                '}';
    }
}
