package JUnit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HinhTronTest {
    Double[] arr = new Double[]{0.512,2.345,-1.002,10.203};
    List<Double> lstBanKinh = Arrays.asList(arr);

    @Test
    void setBanKinh() {
        for ( Double banKinh: lstBanKinh) {
            if(banKinh <= 0) throw new RuntimeException("Ban kinh " + banKinh + " khong hop le");
        }
    }

    @Test
    void tinhChuVi() {
        for ( double banKinh: lstBanKinh) {
            HinhTron hinhTron = new HinhTron(banKinh);
            double chuVi = hinhTron.tinhChuVi();
            if(banKinh==0.512)
                Assert.assertEquals(3.217,chuVi, 0.000001);
            else if (banKinh == 2.345)
                Assert.assertEquals(14.734,chuVi,0.000001);
            else if(banKinh== -1.002) break;
            else if (banKinh== 10.203) {
                Assert.assertEquals(64.107, chuVi,0.000001);
            }


        }
    }

    @org.junit.jupiter.api.Test
    void tinhDienTich() {
    }
}