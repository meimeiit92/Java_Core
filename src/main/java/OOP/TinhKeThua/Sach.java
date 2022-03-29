package OOP.TinhKeThua;

public class Sach extends ThuVien{
    private String tenTacGia;
    private int soTrang;
    private int gia;
    public Sach(){
        super();
    }
    public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang, int gia){
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia=tenTacGia;
        this.soTrang=soTrang;
        this.gia=gia;
    }
}
