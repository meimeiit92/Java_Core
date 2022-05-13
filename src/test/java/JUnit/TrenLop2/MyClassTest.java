package JUnit.TrenLop2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {
    @Test
    @Disabled("Doi bug #01 duoc fix xong")
    void kiemTraTest(){
        // Thuc hien kiem tra tai day
    }
    // Test condition: vi du moi truongc, he dieu hanh, version java
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testOnWidows(){
        fail("Chua implement chi tiet");
    }
    /*
    Customize test condition: se thuc hien test neu random 1 so lon hon 10, tu 1->10
    */
    @Test
    @EnabledIf("customCondition")
    void enabled(){
        //vvv
    }
    private int getRandomNumber(int min, int max){
        return (int) ((Math.random()* (max-min)+min));
    }
    boolean customCondition(){
        int tmp = getRandomNumber(1,20);
        System.out.println(tmp);
        if(tmp>10){
            return true;
        }
        return false;
    }

}