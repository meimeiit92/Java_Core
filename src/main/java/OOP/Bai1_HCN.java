package OOP;

public class Bai1_HCN {
    private double chieuDai, chieuRong, chuVi, dienTich;
    public void setHcn(double chieuDai, double chieuRong){
        if(chieuDai>0 && chieuRong>0){
            this.chieuDai = chieuDai;
            this.chieuRong = chieuRong;
        }
    }
//    public void Bai1_HCN(double chieuDai, double chieuRong){
//        if(chieuDai>chieuRong&& chieuRong>0){
//            this.chieuDai = chieuDai;
//            this.chieuRong = chieuRong;
//        }
//    }
    public double getChieuDai(){
        return  this.chieuDai;
    }
    public double getChieuRong(){
        return  this.chieuRong;
    }
    public double chuVi(){
        chuVi= (this.chieuDai+this.chieuRong)*2;
        return chuVi;
    }
    public double dienTich(){
        dienTich = this.chieuDai*this.chieuRong;
        return  dienTich;
    }
    public void toStringHcn()
    {
        System.out.printf(String.format("Hcn co chieu dai %f, chieu rong %f, chu vi %f, dien tich %f", chieuDai, chieuRong,chuVi,dienTich));
    }

}
