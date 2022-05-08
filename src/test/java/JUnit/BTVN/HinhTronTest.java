package JUnit.BTVN;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class HinhTronTest {


    @ParameterizedTest(name="Test ban kinh bang {0}")
    @CsvFileSource(resources = "/invalid/DataHinhTron.csv", numLinesToSkip = 1)
    void testBanKinh(double banKinh) {
        Exception e = Assertions.assertThrows(RuntimeException.class,()-> {
            HinhTron hinhTron = new HinhTron(banKinh);
            hinhTron.setBanKinh(banKinh);
        });
        Assertions.assertEquals("Ban kinh khong hop le", e.getMessage());
    }


    @ParameterizedTest(name="Test ban kinh la {0} thi chu vi la {1} dien tich la {2}")
    @CsvFileSource(resources = "/valid/DataHinhTron.csv", numLinesToSkip = 1)
    void testChuVi(double banKinh, double chuViExpected, double dienTichExpected) {
        HinhTron hinhTron = new HinhTron();
        hinhTron.setBanKinh(banKinh);
        double chuViActual = hinhTron.tinhChuVi();
        double dienTichActual = hinhTron.tinhDienTich();
        Assertions.assertEquals(chuViExpected,chuViActual,0.001);
        Assertions.assertEquals(dienTichExpected,dienTichActual,0.001);
    }

}