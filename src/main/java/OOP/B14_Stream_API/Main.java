package OOP.B14_Stream_API;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Danh dach cac so nguyen
        int [] daySo = {1,2,5,-5,0,7,8,10,9,20,-4,6,7,30,40};
        // In ra danh sach cac so co trong day

        Arrays.stream(daySo).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.print(value + "\t");
            }
        });
        System.out.println();
        // In ra cac so duong (lon hon 0)
        Arrays.stream(daySo).filter(i -> i>0).forEach(
                i-> System.out.print(i + "\t")
        );
        System.out.println();
        // Dem cac so am trong day
        // cach 1
        int count = 0;
        for (int i : daySo) {
            if(i<0) count ++;
        }
        System.out.printf("co %d so am \n", count);
        // Cach 2: su dung steam API:  day so cua minh chuyen ve Stream thi co the ap dung dc nhieu phep tinh -> sau do loc (<0) -> dem
        long count1=  Arrays.stream(daySo).filter(i-> i<0).count();
        System.out.printf("co %d so am \n", count1);
        // In ra tat ca cac so duong > va la so chan
        // Day -> stream 1: loc > 0 -> filter 2: kiem tra chan thì in ra
        Arrays.stream(daySo).filter(i-> i>0).filter(i-> i%2==0).forEach(i-> System.out.print(i+"\t"));
        System.out.println();
        // Tao ra 1 day so moi, day ban dau ten la x
        // Day moi, moi phan tu trong y = 2x + 1
        // tao danh sach moi thoa man dieu kien tren
        Arrays.stream(daySo).map(new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand*2+1;
            }
        }).forEach(i -> System.out.println(i+"\t"));


    }
}
