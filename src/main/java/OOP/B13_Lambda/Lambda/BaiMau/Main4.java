package OOP.B13_Lambda.Lambda.BaiMau;

import java.util.Locale;
import java.util.function.Function;

public class Main4 {
    public static void printHandlingString(String source, Function<String, String> fn){
        System.out.println(fn.apply(source)) ;
    }

    public static void main(String[] args) {
        // VD In ra chuoi viet hoa
        printHandlingString("Hello world", (s)->{
            return s.toUpperCase(Locale.ROOT);
        });
        // In ra chuoi viet thuong
        printHandlingString("Hello world", (s)->{
            return s.toLowerCase();
        });
        // CHuyen tieng anh thanh tieng viet.
        printHandlingString("Hello world", (s)->{
            return "Xin chao";
        });
    }

}
