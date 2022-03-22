package OOP.TinhDongGoi;

public class Circle {
    private double radius = 1.0;
    public Circle(){};
    public Circle(double radius){
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI;
    }
    public double getCircumference(){
        double pi = getArea();
        return  2*radius*pi;
    }
    public String toString1(){
        //return "ban kinh = "+radius+ "chu vi = "+getCircumference()+"";
        String abc="abc";
        return  abc;
        //return  (String.format("ban kinh = "+radius+ "chu vi = "+getCircumference()+"")) ;
    }
}
