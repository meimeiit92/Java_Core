package OOP;

public class Bai3_main {
    public static void main(String[] args)
    {
        Bai3_Vehicle xe1 = new Bai3_Vehicle(1000,90);
        Bai3_Vehicle xe2 = new Bai3_Vehicle(1000,150);
        Bai3_Vehicle xe3 = new Bai3_Vehicle(1000,250);
        System.out.printf(" %12s %10s %10s \n","Gia tri xe","Dung tich xi lanh","Thue phai nop");
        xe1.inXe();
        xe2.inXe();
        xe3.inXe();
    }
}
