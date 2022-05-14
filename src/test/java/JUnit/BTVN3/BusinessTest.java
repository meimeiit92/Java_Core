package JUnit.BTVN3;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BusinessTest {

    private static final int COL_CUSTOMER = 0;
    private static final int COL_MEMBER = 1;
    private static final int COL_MEMBER_TYPE = 2;
    private static final int COL_DATE = 3;
    private static final int COL_SERVICE_EXPENSE = 4;
    private static final int COL_PRODUCT_EXPENSE = 5;
    private static final int COL_TOTAL_EXPENSE = 6;
    private static  String CSV_PATH = "Expense.csv";
    @BeforeEach
    void createCustomer(){
        Customer customer = new Customer();
        customer.setName("Test");
        customer.setMember(false);
        customer.setMemberType("Thuong dan");

    }
    @ParameterizedTest(name = "Customer {0}, is member {1}, member type {2} on date {3} service expense {4} product expense {5} total expense {6}")
    @MethodSource("dataExpense")
    void getTotalExpense(String name, boolean isMember, String memberType, Date date, String serviceExpense, String productExpense, double totalExpense) {
        Visit visit = new Visit(new Customer(name,isMember,memberType),date);
        if(serviceExpense.trim().isEmpty()) serviceExpense="0";
        if(productExpense.trim().isEmpty()) productExpense="0";
        visit.setServiceExpense(Double.parseDouble(serviceExpense));
        visit.setProductExpense(Double.parseDouble(productExpense));

        Assertions.assertEquals(totalExpense,visit.getTotalExpense());

    }
    private final static Stream<Arguments> dataExpense() throws IOException {
        URL url = Thread.currentThread().getContextClassLoader().getResource(CSV_PATH);
        Reader in = new FileReader(url.getPath());
        List<CSVRecord> tmp = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in).getRecords();
        Stream<Arguments> mData = tmp.stream().map(r -> Arguments.of(r.get(COL_CUSTOMER), r.get(COL_MEMBER), r.get(COL_MEMBER_TYPE), r.get(COL_DATE),
                r.get(COL_SERVICE_EXPENSE),r.get(COL_PRODUCT_EXPENSE),r.get(COL_TOTAL_EXPENSE) ));
        return mData;
    }
}