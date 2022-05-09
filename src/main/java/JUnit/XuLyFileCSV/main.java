package JUnit.XuLyFileCSV;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class main {
    private static final int CHIEU_DAI = 0;
    private static final int CHIEU_RONG = 1;
    private static final int CHU_VI = 2;
    private static final int DIEN_TICH = 3;
    private static final int EXCEPTION = 4;

    // thu su dung thu vien lam viec voi file CSV
    public static void main(String[] args) {
        Reader in = null;
        try{
            in = new FileReader("/home/mayvu/Downloads/dataTest.csv");
            // Đọc từng bản ghi có trong CSV - loại trừ dòng đầu
            Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
            for (CSVRecord record : records) {
                String cRong = record.get(CHIEU_RONG);
                System.out.println(cRong);
                String cDai = record.get(CHIEU_DAI);
                System.out.println(cDai);
            }
        }
        catch (IOException e){
            throw  new RuntimeException(e);
        }

    }
}
