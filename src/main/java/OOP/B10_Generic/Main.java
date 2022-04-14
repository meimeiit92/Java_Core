package OOP.B10_Generic;

public class Main {
    public static void main(String[] args) {
        // Box 1 luu so
        Box<Double> box1 = new Box<>();
        box1.setA(1.5);

        Box<String> box2 = new Box<>();
        box2.setA("Hello");

        //HoaQua tao = new HoaQua("tao","gia");
        Box<HoaQua> hoaQua = new Box<>();
        hoaQua.setA(new HoaQua("ten","gia"));
        hoaQua.toString();

        System.out.println(hoaQua);

        Box<Box> box4 = new Box<>(new Box());
        box4.setA(box2);

        System.out.println(box4);

        System.out.println(box1);
        System.out.println(box2);
    }
}
