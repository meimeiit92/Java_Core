package testingHelloWorld;

import java.sql.Struct;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class B4_Control_Flow {
    public static void  main(String[] args)
    {
        demSoNgayCuaThang();
        cacNgayTrongTuan();
        veTamGiac1();
        veTamGiac2();
        reversedNumber();
        veTamGiacPascal();
        kiemTraKiTu();
    }
    private static void demSoNgayCuaThang()
    {
        Scanner input = new Scanner(System.in);

        int so_ngay_cua_thang = 0;
        String ten_thang = "Unknown";

        System.out.print("Moi ban nhap thang: ");
        int thang = input.nextInt();

        System.out.print("Moi ban nhap nam: ");
        int nam = input.nextInt();

        switch (thang) {
            case 1:
                ten_thang = "Thang 1";
                so_ngay_cua_thang = 31;
                break;
            case 2:
                ten_thang = "Thang 2";
                if ((nam % 400 == 0) || ((nam % 4 == 0) && (nam % 100 != 0))) {
                    so_ngay_cua_thang = 29;
                } else {
                    so_ngay_cua_thang = 28;
                }
                break;
            case 3:
                ten_thang = "Thang 3";
                so_ngay_cua_thang = 31;
                break;
            case 4:
                ten_thang = "Thang 4";
                so_ngay_cua_thang = 30;
                break;
            case 5:
                ten_thang = "Thang 5";
                so_ngay_cua_thang = 31;
                break;
            case 6:
                ten_thang = "Thang 6";
                so_ngay_cua_thang = 30;
                break;
            case 7:
                ten_thang = "Thang 7";
                so_ngay_cua_thang = 31;
                break;
            case 8:
                ten_thang = "Thang 8";
                so_ngay_cua_thang = 31;
                break;
            case 9:
                ten_thang = "Thang 9";
                so_ngay_cua_thang = 30;
                break;
            case 10:
                ten_thang = "Thang 10";
                so_ngay_cua_thang = 31;
                break;
            case 11:
                ten_thang = "Thang 11";
                so_ngay_cua_thang = 30;
                break;
            case 12:
                ten_thang = "Thang 12";
                so_ngay_cua_thang = 31;
        }
        System.out.print(ten_thang + " nam " + nam + " co " + so_ngay_cua_thang + " ngay\n");
    }
    private static void cacNgayTrongTuan()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Moi ban nhap vao cac so tu 1 den 7: ");
        int day = in.nextInt();

        String dayName = "";
        switch (day) {
            case 1: dayName = "Thu 2"; break;
            case 2: dayName = "Thu 3"; break;
            case 3: dayName = "Thu 4"; break;
            case 4: dayName = "Thu 5"; break;
            case 5: dayName = "Thu 6"; break;
            case 6: dayName = "Thu 7"; break;
            case 7: dayName = "Chu Nhat"; break;
            default:dayName = "Ngay ban nhap khong dung";
        }
        System.out.println("Ngay ban nhap la "+dayName);
    }
    private static void veTamGiac1() {
        int i, j, n;
        System.out.print("Moi ban nhap so hang can ve : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);

            System.out.println("");
        }
    }
    private static void veTamGiac2() {
        int i, j, n;
        System.out.print("Moi ban nhap so hang can ve : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j + " ");

            System.out.println("");
        }
    }
    private static void reversedNumber()
    {
        int num, reversed = 0;
        System.out.print("Moi ban nhap so: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        while(num != 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("So sau khi dao chieu la: " + reversed);
    }
    private static void veTamGiacPascal()
    {
        int soHang,c=1,blk,i,j;
        System.out.print("Moi ban nhap so hang can ve: ");
        Scanner in = new Scanner(System.in);
        soHang = in.nextInt();
        for(i=0;i<soHang;i++)
        {
            for(blk=1;blk<=soHang-i;blk++)
                System.out.print(" ");
            for(j=0;j<=i;j++)
            {
                if (j==0||i==0)
                    c=1;
                else
                    c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
            System.out.print("\n");
        }
    }
    private static void kiemTraKiTu()
    {
        String input;
        boolean isBalanced = false;
        System.out.print("Moi ban nhap ki tu can kiem tra ");
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        while (input.contains("()") || input.contains("[]") || input.contains("{}")) {
            input = input.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }
        if (input.length() == 0)
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
