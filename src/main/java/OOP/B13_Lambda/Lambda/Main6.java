package OOP.B13_Lambda.Lambda;

import java.util.function.Predicate;

public class Main6 {

    public static void printStringWithCondition(Predicate<String> predicate, String[] strings) {
        for (String str : strings) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        // Prediacate
        // VD: mảng String gồm nhiều phần tử
        // In ra mảng String đó với nhiều điều kiện khác nhau?
        // VD:1. in ra các String có length > 5 kí tự
        // 2. in ra các String chỉ viết thường
        // 3. in ra các string có chứa kí tự a hoặc z
        // 4. in ra các String có kí tự đặc biệt....

        String[] myStrings = {"Hello", "hi", "bye", "ball", "phone", "TV", "Pen", "UXZ*%", "Welcome to Java"};

        // 1. In ra với length > 5
        printStringWithCondition(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if (s.length() > 5) return true;
                return false;
            }
        }, myStrings);

        // 2. In ra các string chỉ viết thường ???
        printStringWithCondition(s -> {
            if (s.equals(s.toLowerCase())) return true;
            return false;
        }, myStrings);

        // 3. In ra các string có chứa kí tự a hoặc z (viết thường) ???
        /*
          Có thể viết printStringWithCondition(s ->s.contains("a") || s.contains("z") ? true : false, myStrings);
         */
        printStringWithCondition(s -> {
            if (s.contains("a") || s.contains("z")) return true;
            return false;
        }, myStrings);

        // 4. in ra các String có kí tự đặc biệt? không phải a-zA-Z0-9 -> Regex xử lý
        // [a-zA-Z0-9 ]+

    }
}
