package OOP.tinhTruuTuongBai1;

public class ResizableCircle_Main {
    public static void main(String[] args) {
        GeometricObject geo = new Circle(4.0);
        System.out.println("perimeter is "+ geo.getPerimeter());
        System.out.println("area is " + geo.getArea());


        Resiable resize1 = new ResizableCircle(4.0);
        resize1.resize(50);
        System.out.println(resize1.toString());
    }
}
