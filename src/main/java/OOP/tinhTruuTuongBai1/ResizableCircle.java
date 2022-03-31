package OOP.tinhTruuTuongBai1;

public class ResizableCircle extends Circle implements Resiable{
    //double radius;
    public ResizableCircle (double radius)
    {
        super(radius);
    }
    public void resize(int percent){
        radius *= percent/100.0;
    }

    public String toString(){
        return super.toString();
    }
}
