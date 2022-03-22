package OOP.TinhKeThua;

public class Cylinder extends Circle{
    private double height = 1.0;
    public Cylinder(){
        super();
    }
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius, double heght){
        super(radius);
        this.height=heght;
    }
    public Cylinder(double radius, double height, String color){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        double radius = getRadius();
        double theTich = Math.PI*radius*radius*height;
        return theTich;
    }
    public String toString(){

        String output = String.format("radius =" +getRadius() + " height = "+getHeight()+ " volume = "+getVolume());
        System.out.println(output);
        return output;
    }
}
