package OOP.B10_Generic;

public class TuDien <K,V>{
    private K k;
    private V v;

    public TuDien(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public TuDien() {
    }

    @Override
    public String toString() {
        return "TuDien{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }

    public void setK(K k) {
        this.k = k;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public V getV() {
        return v;
    }
}
