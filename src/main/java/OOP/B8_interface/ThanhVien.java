package OOP.B8_interface;

public class ThanhVien {
    String hoTen, ngheNghiep;
    protected int tuoi, soCCCD;

    public String getHoTen() {
        return hoTen;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getSoCCCD() {
        return soCCCD;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setSoCCCD(int soCCCD) {
        this.soCCCD = soCCCD;
    }

    public ThanhVien(String hoTen, String ngheNghiep, int tuoi, int soCCCD) {
        this.hoTen = hoTen;
        this.ngheNghiep = ngheNghiep;
        this.tuoi = tuoi;
        this.soCCCD = soCCCD;
    }

    public ThanhVien() {
    }
}
