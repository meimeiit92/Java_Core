package JUnit.TrenLop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class HinhChuNhatTest {
    private HinhChuNhat hinhChuNhat = new HinhChuNhat();


    @Test
    @DisplayName("Nem ra exception khi kich thuoc canh khong hop le")
    void nemRaExceptionContructor(){
        Exception e = Assertions.assertThrows(RuntimeException.class, new Executable(){
            @Override
            public void execute() throws Throwable{
                // Viet cac lenh co the sinh ra exception tai day
                HinhChuNhat hcn = new HinhChuNhat(1,-1);
            }
        });
        Assertions.assertEquals("Khong the tao doi tuong", e.getMessage());
    }
    // TH2: dai 2.5, rong 0
    @ParameterizedTest(name="Chieu dai la {0}, chieu rong la {1} khong hop le")
    @CsvSource ({"2.5,0","-3,-4"})

    void nemRaExceptionContructor2(double chieuDai, double chieuRong){
        Exception e = Assertions.assertThrows(RuntimeException.class,()-> {
            HinhChuNhat hcn = new HinhChuNhat(chieuDai,chieuRong);
        });
        Assertions.assertEquals("Khong the tao doi tuong", e.getMessage());
    }
    @ParameterizedTest(name="Chieu dai la {0}, chieu rong la {1} khong hop le")
    @CsvFileSource(resources = "/invalid/data.csv", numLinesToSkip = 1)
    void nemRaExceptionContructor3(double chieuDai, double chieuRong){
        Exception e = Assertions.assertThrows(RuntimeException.class,()-> {
            HinhChuNhat hcn = new HinhChuNhat(chieuDai,chieuRong);
        });
        Assertions.assertEquals("Khong the tao doi tuong", e.getMessage());
    }

    @ParameterizedTest(name="Canh {0} khong hop le")
    @ValueSource(doubles = {-3.5,-4.5,0, -0.134})
    void nemRaExeptionKhiChieuDaiBeHonHoacBang0(double canh){
        Exception e = Assertions.assertThrows(RuntimeException.class,()->{
            HinhChuNhat hcn = new HinhChuNhat(3,4);
            hcn.setChieuDai(canh);
        });
        Assertions.assertEquals("Canh phai duong",e.getMessage());
    }
    @ParameterizedTest(name="Canh {0} khong hop le")
    @ValueSource(doubles = {-3.5,-4.5,0, -0.134})
    void nemRaExeptionKhiChieuRongBeHonHoacBang0(double canh){
        Exception e = Assertions.assertThrows(RuntimeException.class,()->{
            HinhChuNhat hcn = new HinhChuNhat(3,4);
            hcn.setChieuDai(canh);
        });
        Assertions.assertEquals("Canh phai duong",e.getMessage());
    }

    @ParameterizedTest(name="Hinh chu nhat co chieu dai la {0}, chieu rong la {1}, chu vi {2}")
    @CsvFileSource(resources = "/valid/data.csv", numLinesToSkip = 1)
    void tinhChuViHinhChuNhat(double chieuDai, double chieuRong, double expectedChuVi){
        // Tinh chinh xac den chu so thap phan thu 3 (khong lam tron)
        // delta = 0.001
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.setChieuRong(chieuRong);
        hcn.setChieuDai(chieuDai);

        double actual = hcn.tinhChuVi();
        Assertions.assertEquals(expectedChuVi,actual,0.001);
    }

    @ParameterizedTest(name="Hinh chu nhat co chieu dai la {0}, chieu rong la {1}, dien tich {3}")
    @CsvFileSource(resources = "/valid/data.csv", numLinesToSkip = 1)
    void tinhDienTichHinhChuNhat(double chieuDai, double chieuRong,double chuVi, double expectedDienTich){
        // Tinh chinh xac den chu so thap phan thu 3 (khong lam tron)
        // delta = 0.001
        HinhChuNhat hcn = new HinhChuNhat(chieuDai,chieuRong);

        double actual = hcn.tinhDienTich();
        Assertions.assertEquals(expectedDienTich,actual,0.001);
    }
}