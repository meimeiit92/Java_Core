package OOP.B8_interface;

import java.util.List;

public class KhuPho {
    String tenKhuPho;
    List<HoDan> hoDan;

    public String getTenKhuPho() {
        return tenKhuPho;
    }

    public List<HoDan> getHoDan() {
        return hoDan;
    }

    public void setHoDan(List<HoDan> hoDan) {
        this.hoDan = hoDan;
    }

    public void setTenKhuPho(String tenKhuPho) {
        this.tenKhuPho = tenKhuPho;
    }

    public KhuPho(String tenKhuPho, List<HoDan> hoDan) {
        this.tenKhuPho = tenKhuPho;
        this.hoDan = hoDan;
    }

    public void inKhuPho()
    {
        System.out.println("So ho dan trong khu pho la " + hoDan.stream().count());
        for(HoDan hd : hoDan){
            hd.inHoDan();
        }
    }
    public void inHoDanTheoDiaChi(String diaChi){
        for(HoDan hd : hoDan){
            if (hd.diaChi.contains(diaChi)){
                hd.inHoDan();
            }
        }
    }
}
