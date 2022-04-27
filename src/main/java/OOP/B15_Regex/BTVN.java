package OOP.B15_Regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BTVN {
    public static void main(String[] args) {
        String[] arr = { "086", "096", "097", "098" , "032","033","034","035","036","037","038","039"};
        List<String> lstDauSoViettel = Arrays.asList(arr);
        Pattern pattern = Pattern.compile("(0)(8|9|3)[2-9]");
        for ( String item : lstDauSoViettel) {
            System.out.println(item + ": "+ Pattern.matches("(0)(8|9|3)[2-9]",item));
        }
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
        if (Pattern.matches("(((\\+|)84)|0)(3|5|7|8|9)+([2-9]{8})",soDienThoai))
            System.out.println("Day la so dien thoai viettel");
        else System.out.println("Day khong phai la sdt viettel");


    }
    public static boolean checkPhone(String str) throws Exception {
        // Bieu thuc chinh quy mo ta dinh dang so dien thoai
        String reg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";

        // Kiem tra dinh dang
        boolean kt = str.matches(reg);

        if (kt == false) {
            throw new Exception("Loi: Khong dung dinh dang!");
        } else {
            System.out.println("Dung dinh dang so dien thoai!");
        }
        return  kt;
    }

}
