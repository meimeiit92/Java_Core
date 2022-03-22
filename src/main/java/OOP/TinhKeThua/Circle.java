package OOP.TinhKeThua;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){};
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(Double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return 2*radius*Math.PI;
    }
    @Override
    public String toString(){
        String inOutPut=String.format("Circle have radius = "+ radius + " color = "+color+ " area = "+getArea());
        System.out.println(inOutPut);
        return inOutPut;
    }
}
