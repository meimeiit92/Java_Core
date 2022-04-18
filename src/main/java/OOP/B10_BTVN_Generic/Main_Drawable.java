package OOP.B10_BTVN_Generic;

public class Main_Drawable {
    public static void main(String[] args) {
        Drawable drawable = new Drawable();
        HinhTron hTron = new HinhTron(2);
        HinhVuong hVuong = new HinhVuong(2);
        drawable.draw(hTron);
        drawable.draw(hVuong);

    }
}
