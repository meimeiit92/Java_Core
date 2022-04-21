package OOP.B13_Lambda.Lambda;

public class Main {
    interface  Calculator{
        // Phep toan voi 2 so thuc a,b -> deu tra ve 1 so thuc
        double operator(double a, double b);
    }

    public static void main(String[] args) {
        // Lambda
        Calculator sum = (a,b) -> {
            return a+b;
        };
        System.out.println(sum.operator(5,6));
        // tinh bieu thuc 2x + 5y+10
        Calculator express = (x,y) -> {
            return 2*x + 5*y+10;
        };
        System.out.println(express.operator(1,2));
    }
}
