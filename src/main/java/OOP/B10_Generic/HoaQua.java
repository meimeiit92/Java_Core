package OOP.B10_Generic;

public class HoaQua {
    String ten;
    String gia;

    public HoaQua() {
    }

    public HoaQua(String ten, String gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public String getGia() {
        return gia;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "HoaQua{" +
                "ten='" + ten + '\'' +
                ", gia='" + gia + '\'' +
                '}';
    }
}
