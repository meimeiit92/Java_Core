package OOP.B13_Lambda.Lambda;

public class Main2 {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println(myCalculator.cong(4,5));
        // Muon tinh phep tinh (2a+5b)*3
        double result = myCalculator.doSomeThing((a,b)->{
            return (2*a+5*b)+3;
        },4,5);
        System.out.println(result);

        // tinh gia tri 2^3
        double result1 = myCalculator.doSomeThing((a,b)->{
            return Math.pow(a,b);
        },2,3);
        System.out.println(result1);
    }
}
