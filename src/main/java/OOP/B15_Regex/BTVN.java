package OOP.B15_Regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BTVN {
    public static void main(String[] args) {

        // validate SDT
        Scanner in = new Scanner(System.in);
        System.out.println("moi ban nhap SDT");
        boolean isSoDienThoai = false;
        String  soDienThoai = null;
        do{
            try{
                soDienThoai = in.next();
                isSoDienThoai = checkPhone(soDienThoai);
            }
            catch (Exception ex){
                System.out.println("Nhap sai format so dien thoai. Moi ban nhap lai");
            }
        }
        while (isSoDienThoai == false);


    }
    public static boolean checkPhone(String str) throws Exception {
        // Bieu thuc chinh quy mo ta dinh dang so dien thoai
        String reg = "^(\\(?\\+84\\)?|0)([\\.\\-\\s])?(3[2-9]|8[6]|9[6-8])([1-9]|[\\.\\-\\s])[1-9|\\-\\s][1-9]{3}[\\.\\-\\s]?[0-9]{2}[0-9]?";

        // Kiem tra dinh dang
        boolean kt = str.matches(reg);

        if (kt == false) {
            throw new Exception("Loi: Khong dung dinh dang!");
        } else {
            System.out.println("Dung dinh dang so dien thoai Viettel!");
        }
        return  kt;
    }

}
