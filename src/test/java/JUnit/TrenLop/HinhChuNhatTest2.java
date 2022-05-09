package JUnit.TrenLop;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HinhChuNhatTest2 {
    private static final int COL_CHIEU_DAI = 0;
    private static final int COL_CHIEU_RONG = 1;
    private static final int COL_CHU_VI = 2;
    private static final int COL_DIEN_TICH = 3;
    private static final int COL_EXCEPTION = 4;
    // Sử dụng 1 file duy nhất để test
    // TH1: Ném khi ném ra exception khi dữ liệu không hợp lệ (3 dòng đầu)
    // lấy cột: chiều dài, chiều rộng, exception

    // TH2: tính khi dữ liệu của mình đã chính xác (3 dòng cuối)
    // lấy cột: chiều dài, chiều rộng, chu vi, diện tích

    @ParameterizedTest(name = "HCN có chiều dài {0}, chiều rộng {1} ném ra exception {2}")
    @MethodSource("dataThrowException")
    void nemRaException(double chieuDai, double chieuRong, String expectedException) {
        Exception exception = Assertions.assertThrows(RuntimeException.class, () -> {
            HinhChuNhat hinhChuNhat = new HinhChuNhat(chieuDai, chieuRong);
        });
        Assertions.assertEquals(expectedException, exception.getMessage());
    }

    // TH1: viết 1 hàm -> đọc và lọc ra các cột cần thiết -> đưa vào đầu vào của paramtertest

    static Stream<Arguments> dataThrowException() throws IOException {
        Reader in = new FileReader("/home/mayvu/Downloads/dataTest.csv");
        Stream<Arguments> tmp = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in)
                .stream()
                .limit(3)
                .map(r -> Arguments.of(r.get(COL_CHIEU_DAI), r.get(COL_CHIEU_RONG), r.get(COL_EXCEPTION))
                );
        return tmp;
    }

    // TH2:
    @ParameterizedTest(name = "HCN có chiều dài {0}, chiều rộng {1} chu vi {2}")
    @MethodSource("dataHapplyCase")
    void happyCase(double chieuDai, double chieuRong, double chuVi) {
            HinhChuNhat hinhChuNhat = new HinhChuNhat();
            hinhChuNhat.setChieuDai(chieuDai);
            hinhChuNhat.setChieuRong(chieuRong);
            Assertions.assertEquals(chuVi, hinhChuNhat.tinhChuVi(),0.0001);
    }

    // DUng skip de bo qua 3 dong dau
    static Stream<Arguments> dataHapplyCase() throws IOException {
        Reader in = new FileReader("/home/mayvu/Downloads/dataTest.csv");
        Stream<Arguments> tmp = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in)
                .stream()
                .skip(3)
                .map(r -> Arguments.of(r.get(COL_CHIEU_DAI), r.get(COL_CHIEU_RONG), r.get(COL_CHU_VI))
                );
        return tmp;
    }

    // Test ca chu vi va dien tich
    static Stream<Arguments> dataHapplyCaseChuViDienTich() throws IOException {
        Reader in = new FileReader("/home/mayvu/Downloads/dataTest.csv");
        Stream<Arguments> tmp = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in)
                .stream()
                .skip(3)
                .map(r -> Arguments.of(r.get(COL_CHIEU_DAI), r.get(COL_CHIEU_RONG), r.get(COL_CHU_VI), r.get(COL_DIEN_TICH))
                );
        return tmp;
    }
    @ParameterizedTest(name = "HCN có chiều dài {0}, chiều rộng {1} chu vi {2} dien tich {3}")
    @MethodSource("dataHapplyCaseChuViDienTich")
    void happyCase(double chieuDai, double chieuRong, double chuVi, double dienTich) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.setChieuDai(chieuDai);
        hinhChuNhat.setChieuRong(chieuRong);
        Assertions.assertAll(
                ()->{
                    Assertions.assertEquals(chuVi, hinhChuNhat.tinhChuVi(),0.001);},
                ()->{
                    Assertions.assertEquals(dienTich, hinhChuNhat.tinhDienTich(),0.001);}
        );
    }
    // Lay ra 1 dong cu the: tu dong nao den dong nao: lay dong 5 va 6 de test dien tich?
    static Stream<Arguments> dataDungSkipLimit() throws IOException {
        Reader in = new FileReader("/home/mayvu/Downloads/dataTest.csv");
        List<CSVRecord> tmp = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in).getRecords();
        // Tinh kinh thuoc, dong dau la header
        long len = tmp.size();
        long from =4, to = 5;
        Stream<Arguments> rs = tmp.stream().skip(len-from+1).limit(to-from+1)
                .map(r-> Arguments.of(
                        r.get(COL_CHIEU_DAI),
                        r.get(COL_CHIEU_RONG),
                        r.get(COL_DIEN_TICH)
                ));
        return rs;
    }

    @ParameterizedTest(name = "HCN có chiều dài {0}, chiều rộng {1} dien tich {2}")
    @MethodSource("dataDungSkipLimit")
    void testDong5Va6(double chieuDai, double chieuRong,double dienTich) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.setChieuDai(chieuDai);
        hinhChuNhat.setChieuRong(chieuRong);
        Assertions.assertEquals(dienTich,hinhChuNhat.tinhDienTich());
    }

}