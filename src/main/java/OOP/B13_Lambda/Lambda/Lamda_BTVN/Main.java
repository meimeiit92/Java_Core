package OOP.B13_Lambda.Lambda.Lamda_BTVN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    interface TinhToan {
        int countK(String str);
    }

    public static void main(String[] args) {
        // Dem so ky tu
        TinhToan myCal = (str) -> {
            return str.length();
        };
        System.out.println("So ki tu la " + myCal.countK("helo hapj"));

        // dem so tu
        TinhToan soTu = (str) -> {
            str = str.trim();
            String[] lst = str.split(" ");
            return (int) Arrays.stream(lst).count();
        };
        System.out.println("So tu la " + soTu.countK("helo hapj"));

        // Đếm số từ 'a', 'A' trong chuỗi.
        TinhToan soTuA = (str) -> {
            int counter = 0;
            char array[] = new char[str.length()];
            for (int i = 0; i < str.length(); i++){

                array[i] = str.charAt(i);
                if (array[i] == 'a' || array[i] == 'A')
                    counter++;}
            return counter;
        };
        System.out.println("So tu la " + soTuA.countK("helo haAj"));

        // Đếm số kí tự được sử dụng trong chuỗi. (mỗi kí tự chỉ in 1 lần)
        TinhToan soTuTrongChuoi = (str) -> {
            int counter[] = new int[256];
            int len = str.length();
            for (int i = 0; i < len; i++)
                counter[str.charAt(i)]++;
            char array[] = new char[str.length()];
            for (int i = 0; i < len; i++) {
                array[i] = str.charAt(i);
                int flag = 0;
                for (int j = 0; j <= i; j++) {
                    if (str.charAt(i) == array[j])
                        flag++;
                }
                if (flag == 1)
                    System.out.println("Số lần xuất hiện của " + str.charAt(i)
                            + " trong chuỗi:" + counter[str.charAt(i)]);
            }
            return 0;
        };
        System.out.println("So tu la " + soTuTrongChuoi.countK("helo haAj"));
    }
}
