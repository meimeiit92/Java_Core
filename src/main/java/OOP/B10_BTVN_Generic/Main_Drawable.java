package OOP.B10_BTVN_Generic;

public class Main_Drawable {
    public static void main(String[] args) {
        Drawable hinhTron = new Drawable<HinhTron>();
        hinhTron.setT(new HinhTron(2));
        hinhTron.draw();

        Drawable hinhVuong = new Drawable<HinhVuong>();
        hinhVuong.setT(new HinhVuong(2));
        hinhVuong.draw();

    }
}
