package OOP.TinhKeThua;

public class TapChi extends ThuVien{
    private int soPhatHanh;

    public TapChi(){
        super();
    }

    public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh,  int soPhatHanh){
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh=soPhatHanh;
    }
}
