package JUnit.TrenLop2;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MyClass2Test {
    Connection conn = null;

    // chay 1 lan thoi
    @BeforeAll
    static void setup(){
        System.out.println("Chuan bi bien, moi truong...");
    }
    @AfterAll
    static void tearDown(){
        System.out.println("Ket thuc test, giai phong cac tai nguyen.....");
    }

    // chya voi moi test
    @BeforeEach
    void createConnection(){
        conn = new Connection();
        conn.connect();
        System.out.println("Connect to DB");
    }
    @AfterEach
    void closeConnection(){
        if(conn != null){
            conn.close();
        }
        System.out.println("Close connection");
    }
    @Test
    void getProductById(){
        MyClass2 myClass2 = new MyClass2();
        Assertions.assertEquals("Iphone", myClass2.getProductNameById(1));
        //
    }
    @ParameterizedTest(name = "Update san pham co id la {1}, voi ten moi la {0}")
    @CsvSource({"Iphone13,1"})
    void updateProductNameById(String name, long id){
        MyClass2 myClass2 = new MyClass2();
        Assertions.assertTrue(myClass2.updateProductionNameById(name,id));
    }

    @RepeatedTest(10)
    void test(){
        System.out.println("Thuc hien lai 10 lan");
    }
}

