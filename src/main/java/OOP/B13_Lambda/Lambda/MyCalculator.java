package OOP.B13_Lambda.Lambda;

public class MyCalculator {
    // Chi cho phep tinh toan cong , tru, nhan, chia co ban, dong thoi cho phep nguoi dung tu dinnh nghia
    // nhanh cac phep tinh
    interface  Operator{
        double Value (double a, double b);
    }
    public double cong(double a, double b){
        return a+b;
    }
    public double tru(double a, double b){
        return a-b;
    }
    // do Somthing
    public double doSomeThing(Operator operator, double a, double b){
        return operator.Value(a,b);
    }
}
