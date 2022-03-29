package OOP.TinhKeThua;

public class ThuVien {
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh = 50;

    public ThuVien(){};

    public ThuVien(String maTaiLieu,String tenNhaXuatBan, int soBanPhatHanh){
        this.maTaiLieu=maTaiLieu;
        this.tenNhaXuatBan=tenNhaXuatBan;
        this.soBanPhatHanh=soBanPhatHanh;
    }
}
