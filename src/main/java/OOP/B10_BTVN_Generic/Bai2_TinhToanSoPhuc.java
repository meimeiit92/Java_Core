package OOP.B10_BTVN_Generic;

import OOP.B9_Exception2.SoPhuc;

public class Bai2_TinhToanSoPhuc <T> extends SoPhuc implements Bai2_ITinhToan{
    double phanThuc, phanAo;

    public double getPhanThuc() {
        return phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    public Bai2_TinhToanSoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public Bai2_TinhToanSoPhuc() {
    }

    @Override
    public Object cong(Object[] args) {
        return null;
    }

    @Override
    public Object cong1So(Object obj) {
        return null;
    }
}
