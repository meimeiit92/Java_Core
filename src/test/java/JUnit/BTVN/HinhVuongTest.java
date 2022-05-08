package JUnit.BTVN;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class HinhVuongTest {

    @ParameterizedTest(name="Test canh bang {0}")
    @CsvFileSource(resources = "/invalid/DataHinhVuong.csv", numLinesToSkip = 1)
    void testBanKinh(long canh) {
        Exception e = Assertions.assertThrows(RuntimeException.class,()-> {
            HinhVuong hinhVuong = new HinhVuong(canh);
            hinhVuong.setCanh(canh);
        });
        Assertions.assertEquals("Canh phai duong", e.getMessage());
    }


    @ParameterizedTest(name="Test canh la {0} thi chu vi la {1} dien tich la {2}")
    @CsvFileSource(resources = "/valid/DataHinhVuong.csv", numLinesToSkip = 1)
    void testChuVi(long canh, long chuViExpected, long dienTichExpected) {
        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.setCanh(canh);
        long chuViActual = hinhVuong.tinhChuVi();
        long dienTichActual = hinhVuong.tinhDienTich();
        Assertions.assertEquals(chuViExpected,chuViActual,0.001);
        Assertions.assertEquals(dienTichExpected,dienTichActual,0.001);
    }

}