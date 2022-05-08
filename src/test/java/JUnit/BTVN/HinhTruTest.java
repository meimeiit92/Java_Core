package JUnit.BTVN;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class HinhTruTest {

    @ParameterizedTest(name="Test chieu cao bang {0} ban kinh day bang {1}")
    @CsvFileSource(resources = "/invalid/DataHinhTru.csv", numLinesToSkip = 1)
    void testBanKinh(double chieuCao, double banKinhDay) {
        Exception e = Assertions.assertThrows(RuntimeException.class,()-> {
            HinhTron hinhTron = new HinhTron(banKinhDay);
            HinhTru hinhTru = new HinhTru(chieuCao, hinhTron);
        });
        String message = e.getMessage();
        boolean isTrue = message.contains("Ban kinh khong hop le")|| message.contains("Chieu cao phai duong");
        Assertions.assertTrue(isTrue);
    }


    @ParameterizedTest(name="Test chieu cao la {0} ban kinh day la {1} dien tich xung quanh la {2} dien tich toan phan la {3} the tich la {4}")
    @CsvFileSource(resources = "/valid/DataHinhTru.csv", numLinesToSkip = 1)
    void testHinhTru(double chieuCao,double banKinhDay, double dienTichXQExpected, double dienTichTPExpected, double theTich) {
        HinhTron hinhTron = new HinhTron(banKinhDay);
        HinhTru hinhTru = new HinhTru();
        hinhTru.setChieuCao(chieuCao);
        hinhTru.setHinhTron(hinhTron);
        double dienTichcXQActual = hinhTru.dienTichXungQuanh();
        double dienTichToanPhanActual = hinhTru.dienTichToanPhan();
        double theTichActual = hinhTru.tinhTheTich();
        Assertions.assertEquals(dienTichXQExpected,dienTichcXQActual,0.002);
        Assertions.assertEquals(dienTichTPExpected,dienTichToanPhanActual,0.002);
        Assertions.assertEquals(theTich,theTichActual,0.002);
    }

}