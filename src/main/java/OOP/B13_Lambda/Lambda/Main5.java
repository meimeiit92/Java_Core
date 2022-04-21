package OOP.B13_Lambda.Lambda;

import java.util.function.Function;

public class Main5 {
    public static double calculatorNumber( Function<int[], Double> fn, int[] number){
        return fn.apply(number);

    }

    public static void main(String[] args) {
        int [] arrNumber = {1,2,3,4};
        // tinh trung binh cong theo binh thuong
        double tbc = calculatorNumber(new Function<int[], Double>() {
            @Override
            public Double apply(int[] ints) {
                double t =0;
                for(int i=0;i<ints.length;i++){
                    t+=ints[i];
                }
                return t/ints.length;
            }
        }, arrNumber);
        // trung binh nhan theo Lambda
        double tbn = calculatorNumber ((ints) ->{
            double t =1;
            for(int i=0;i<ints.length;i++){
                t *=ints[i];
            }
                return Math.pow(t,1/ints.length);

        },arrNumber);
    }
}
