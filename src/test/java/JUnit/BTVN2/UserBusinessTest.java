package JUnit.BTVN2;

import JUnit.TrenLop.HinhChuNhat;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UserBusinessTest {
    private static final int COL_USER = 0;
    private static final int COL_EMAIL = 1;
    private static final int COL_PASSWORD = 2;
    private static final int COL_PASS_MD5 = 3;
    private static final int COL_LOGIN = 4;
    private static final int COL_REGISTER = 5;

    @ParameterizedTest(name="Test Username {0}")
    @CsvFileSource(resources = "/mData.csv", numLinesToSkip = 1)
    void setUserName(String userName) {
        Exception e = Assertions.assertThrows(RuntimeException.class,()->{
            UserBusiness user = new UserBusiness();
            user.setUserName(userName);
        });
        if(userName==null){
            Assertions.assertEquals("User = null",e.getMessage());

        }
        else
        Assertions.assertEquals("Username khong hop le",e.getMessage());
    }

    @ParameterizedTest(name="Test email {0}")
    @MethodSource("dataEmail")
    void setEmail(String email) {
        Exception e = Assertions.assertThrows(RuntimeException.class,()->{
            UserBusiness user = new UserBusiness();
            user.setEmail(email);
        });
        if(email==null){
            Assertions.assertEquals("Email = null",e.getMessage());

        }
        else
            Assertions.assertEquals("Email khong hop le",e.getMessage());
    }
    static Stream<Arguments> dataEmail() throws IOException {
        Reader in = new FileReader("/home/mayvu/Desktop/Java_Core/First_Pr/src/test/resources/mData.csv");
        Stream<Arguments> tmp = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in)
                .stream()
                .skip(2)
                .map(r -> Arguments.of(r.get(COL_EMAIL))
                );
        return tmp;
    }

    @ParameterizedTest(name="Test password {0}")
    @MethodSource("dataPassword")
    void setPassword(String password) {
        Exception e = Assertions.assertThrows(RuntimeException.class,()->{
            UserBusiness user = new UserBusiness();
            user.setPassword(password);
        });
        if(password==null){
            Assertions.assertEquals("Password = null",e.getMessage());

        }
        else
            Assertions.assertEquals("Password khong hop le",e.getMessage());
    }
    static Stream<Arguments> dataPassword() throws IOException {
        Reader in = new FileReader("/home/mayvu/Desktop/Java_Core/First_Pr/src/test/resources/mData.csv");
        List<CSVRecord> tmp = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in).getRecords();
        // Tinh kinh thuoc, dong dau la header
        long len = tmp.size();
        Stream<Arguments> rs = tmp.stream().skip(5).limit(1)
                .map(r-> Arguments.of(
                        r.get(COL_PASSWORD)
                ));
        return rs;
    }
    @ParameterizedTest(name="Test user {0} email {1} password {2} encrytPass {3} login {4}")
    @MethodSource("dataUserEmailPasswordLogin")
    void login(String userName, String email, String password, String passMd5, String login) {
        Exception e = Assertions.assertThrows(RuntimeException.class,()->{
            UserBusiness user = new UserBusiness();
            user.setUserName(userName);
            user.setEmail(email);
            user.setPassword(password);
            if(userName == null){
                boolean isLogin = user.login(email,passMd5);
            }
            else if (email == null){
                boolean isLogin = user.login(userName,passMd5);
            }
            else {
                boolean isLogin = user.login(userName,passMd5);
            }

        });
        Assertions.assertEquals("Username khong hop le",e.getMessage());
    }
    static Stream<Arguments> dataUserEmailPasswordLogin() throws IOException {
        Reader in = new FileReader("/home/mayvu/Desktop/Java_Core/First_Pr/src/test/resources/mData.csv");
        Stream<Arguments> tmp = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in)
                .stream()
                .skip(1)
                .limit(4)
                .map(r -> Arguments.of(r.get(COL_USER),r.get(COL_EMAIL),r.get(COL_PASSWORD),r.get(COL_PASS_MD5),r.get(COL_LOGIN))
                );
        return tmp;
    }
}