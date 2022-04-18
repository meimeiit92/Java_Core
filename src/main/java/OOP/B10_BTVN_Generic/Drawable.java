package OOP.B10_BTVN_Generic;

public class Drawable {
    public <T extends IHinhHoc> void draw(T t){
        System.out.println(t.toString());
    }

}
