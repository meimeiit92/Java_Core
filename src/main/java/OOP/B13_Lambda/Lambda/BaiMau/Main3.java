package OOP.B13_Lambda.Lambda.BaiMau;

import java.util.Locale;
import java.util.function.Function;

public class Main3 {
    public static void main(String[] args) {
        // Dinh nghia nhanh 1 ham co gia tri truyen vaof laf 1 chuoi -> gia tri tra ve la 1 chuoi
        // sau khi duoc viet hoa toan bo
        // viet theo kieu binh thuong
        Function<String , String> convertString = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase(Locale.ROOT);
            }
        };
        // viet theo kiem Lambda
        Function<String,String> convertStringLambda = (s) -> {
            return s.toUpperCase(Locale.ROOT);
        };
        // Su dung
        System.out.println(convertString.apply("hello"));
        System.out.println(convertStringLambda.apply("hello"));
        // Hay viet 1 ham convertString -> chuoi viet hoa chu cai dau tien, con lai la viet thuong
        // VD abcde ghH -> Abd....

        Function<String,String> convertStringLambda1 = (s) -> {
            s= s.toLowerCase(Locale.ROOT);
            char[] tmp = s.toCharArray();
            tmp[0] = Character.toUpperCase(tmp[0]);
            return new String(tmp) ;
        };
        System.out.println(convertStringLambda1.apply("hiaff hiuahf"));
    }
}
