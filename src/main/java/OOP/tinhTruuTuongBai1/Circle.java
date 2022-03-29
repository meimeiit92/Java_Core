package OOP.tinhTruuTuongBai1;

public  class Circle implements GeometricObject{
    protected double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public String toString(){
        return "radius circle after resize is " + radius;
    }
}
