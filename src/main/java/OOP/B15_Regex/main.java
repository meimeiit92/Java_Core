package OOP.B15_Regex;

public class main {
    public static void main(String[] args) {
        // abc -> match chinsh xac abc
        // [a-c] a hoac b hoac c
        // + 1 den nhieu
        // * 0 den nhieu
        // ? : khong hoac 1
        // \s la khoang trang
        // ?= chỉ lấy những cái đằng trước  [\s]+(?=@gmail.com), la dieu kien
        // dau . dai dien cho ki tu nao cung duoc
        // .* Dau cham dai dien cho cac ky tu lap lai 0 den nhieu lan
        // ^ bat dau
        // $ ket thuc
        // .{8,20} co 8-20 ky tu
        // (?=.*[0-9]) co it nhat 1 so
        // (?=.*[a-z]) co it nhat 1 chu thuong
        // (?=.*[A-Z]) co it nhat 1 chu hoa
        // (?=.*[@#$%^&+=]) co it nhat 1 ky tu dac biet
        // (?=\\S+$) khong duoc co khoang trang trong toan bo chuoi
    }
}
