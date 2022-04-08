package OOP.B9_Exception2;

import java.util.Locale;
import java.util.StringTokenizer;

public class VanBan {
    private String st;

    public VanBan(String st) {
        this.st = st;
    }

    public VanBan() {
    }
    public int demSoTuVB(String str){
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        System.out.println("chuoi vua nhap co "+ stringTokenizer.countTokens() + " ki tu");
        return stringTokenizer.countTokens();
    }
    public void chuanHoaChuoi(String str){
        str=str.trim(); //Xoa khoang trang o dau va cuoi string
        str = str.replaceAll("\\s+", " ");// replace nhieu khoang trang thanh 1 khoang trang
        System.out.println("Chuoi sau khi duoc chuan hoa la "+ str);
        //return str;
    }
    public void toUpperCase(String str){
        System.out.println("Chuyen doi chuoi thanh viet hoa "+ str.toUpperCase(Locale.ROOT));
        //return str.toUpperCase(Locale.ROOT);
    }
    public void toLowerCase(String str){
        System.out.println("Chuyen doi chuoi thanh viet thuong "+ str.toLowerCase(Locale.ROOT));
        //return str.toLowerCase(Locale.ROOT);
    }
    public void vietHoaChuCai(String str){
        chuanHoaChuoi(str);
        String[] temp= str.split(" ");
        // sau khi tách xong, gán xâu st thành sâu rỗng
        st="";

            for (int i = 0; i < temp.length; i++) {
                try {
                str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
                if (i < temp.length - 1) // nếu tempt[i] không phải từ cuối cùng
                    str += " ";   // cộng thêm một khoảng trắng
                }catch (StringIndexOutOfBoundsException ex) {
                    System.out.println("Phan tu dac biet");
                }
        }
        System.out.println("Viet hoa chu cai dau tien "+ str);
        //return str;
    }
}
