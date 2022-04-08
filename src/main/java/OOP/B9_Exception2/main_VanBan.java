package OOP.B9_Exception2;

import java.util.Scanner;

public class main_VanBan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        System.out.println("Moi ban nhap vao chuoi ki tu");
        input = in.nextLine();
        VanBan vp = new VanBan();
        vp.demSoTuVB(input);
        vp.chuanHoaChuoi(input);
        vp.toUpperCase(input);
        vp.toLowerCase(input);
        vp.vietHoaChuCai(input);
    }
}
