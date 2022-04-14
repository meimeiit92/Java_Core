package OOP.B10_BTVN_Generic;

public class Drawable <T>{
    private T t;

    public Drawable(T t) {
        this.t = t;
    }

    public Drawable() {
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public void draw (){
        System.out.println("Ve ra " + t);
    }
}
