package OOP;

public class Bai3_Vehicle {
    private double giaTriXe, thueXe=0;
    private int dungTichXiLanh;

    public void setDungTichXiLanh(int dungTichXiLanh) {
        if(dungTichXiLanh>0) {
            this.dungTichXiLanh = dungTichXiLanh;
        }
    }

    public void setGiaTriXe(double giaTriXe) {
        if(giaTriXe>0){
        this.giaTriXe = giaTriXe;
    }
    }

    public int getDungTichXiLanh() {
        return dungTichXiLanh;
    }

    public double getGiaTriXe() {
        return giaTriXe;
    }
    public Bai3_Vehicle (double giaTriXe, int dungTichXiLanh)
    {
        this.dungTichXiLanh = dungTichXiLanh;
        this.giaTriXe = giaTriXe;
    }
    public double tinhThueXe ()
    {
        if(dungTichXiLanh < 100){
            thueXe = 0.01*giaTriXe;
        }
        else if (dungTichXiLanh >100 && dungTichXiLanh <200){
            thueXe = 0.03*giaTriXe;
        }
        else {
            thueXe = 0.05*giaTriXe;
        }
        return  thueXe;
    }
    public void inXe() {
        System.out.printf("%12d %12.2f %12.2f\n", dungTichXiLanh, giaTriXe, tinhThueXe());
    }
}
