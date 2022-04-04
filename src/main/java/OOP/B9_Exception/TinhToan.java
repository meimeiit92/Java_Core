package OOP.B9_Exception;

import java.util.List;
import java.util.Scanner;

public class TinhToan extends PhanSo implements  IPhanSo{

    public PhanSo themPhanSo(int tuSo, int mauSo){
        while ( kiemTraPhanSo(tuSo,mauSo)){
            return new PhanSo(tuSo,mauSo);
        }

        return new PhanSo(tuSo,mauSo);

    }
    @Override
    public  PhanSo congPhanSo(List<PhanSo> ps) {
        PhanSo ketQua = ps.get(0);;
        for(int i=1;i<ps.size();i++){
            ketQua = tong(ketQua, ps.get(i));
        }
        ketQua = toiGianPhanSo(ketQua);
        System.out.println("Ket qua phep cong. Tu so la "+ketQua.getTuSo()+" Mau so la " + ketQua.getMauSo());
        return ketQua;
    }

    @Override
    public PhanSo truPhanSo(List<PhanSo> ps) {
        PhanSo ketQua = ps.get(0);;
        for(int i=1;i<ps.size();i++){
            ketQua = hieu(ketQua, ps.get(i));
        }
        ketQua = toiGianPhanSo(ketQua);
        System.out.println("Ket qua phep tru. Tu so la "+ketQua.getTuSo()+" Mau so la " + ketQua.getMauSo());
        return ketQua;
    }

    @Override
    public PhanSo nhanPhanSo(List<PhanSo> ps) {
        PhanSo ketQua = ps.get(0);;
        for(int i=1;i<ps.size();i++){
            ketQua = tich(ketQua, ps.get(i));
        }
        ketQua = toiGianPhanSo(ketQua);
        System.out.println("Ket qua phep nhan. Tu so la "+ketQua.getTuSo()+" Mau so la " + ketQua.getMauSo());
        return ketQua;
    }

    @Override
    public PhanSo chiaPhanSo(List<PhanSo> ps) {
        PhanSo ketQua = ps.get(0);;
        for(int i=1;i<ps.size();i++){
            ketQua = thuong(ketQua, ps.get(i));
        }
        ketQua = toiGianPhanSo(ketQua);
        System.out.println("Ket qua phep chia. Tu so la "+ketQua.getTuSo()+" Mau so la " + ketQua.getMauSo());
        return ketQua;
    }


}
