package OOP.B10_Generic;

public class Box <A>{
    private A a;
    public Box(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public Box() {
    }

    @Override
    public String toString() {
        return "Box{" +
                "a=" + a +
                '}';
    }
}
