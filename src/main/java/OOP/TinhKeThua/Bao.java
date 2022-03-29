package OOP.TinhKeThua;

import java.util.Date;

public class Bao extends ThuVien{
    private Date ngayPhatHanh;

    public Bao(){
        super();
    }

    public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh,  Date ngayPhatHanh){
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh=ngayPhatHanh;
    }

}
