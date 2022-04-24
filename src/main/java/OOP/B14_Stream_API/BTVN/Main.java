package OOP.B14_Stream_API.BTVN;

import OOP.B14_Stream_API.Student;
import com.github.javafaker.Faker;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Human> lstHuman = new ArrayList<>();
        Faker faker = new Faker(new Locale("vi","VN"));
        for(int i=0;i<1000;i++){
            Human human = new Human();
            human.setId(i);
            human.setFirstName(faker.name().firstName());
            human.setLastName(faker.name().lastName());
            human.setAge(faker.number().numberBetween(10,50));
            human.setGender(faker.number().numberBetween(0,2));
            human.setCity(faker.address().city());
            human.setSalary(faker.number().numberBetween(10,3000));
            lstHuman.add(human);
        }
        //System.out.println(lstHuman);
        // co bao nhieu nam > 18 tuoi
        long soNam = lstHuman.stream().filter(item -> item.getAge()>18)
                .filter(item -> item.getGender()==1).count();
        System.out.println("So luong nam tren 18 tuoi la " + soNam);
        // Dem so luong Nu co ten dem la Thi
        long soNu = lstHuman.stream().filter(item -> item.getGender()==0).filter(item -> item.getFirstName().contains("Thi")).count();
        System.out.println("So luong nu co ten dem la THi la "+ soNu);
        // Loc ra nhung nguoi ho nguyen va sap xem theo chu cai
        List<Human> lstHoNguyen = new ArrayList<>();
        for ( Human human : lstHuman ) {
            if(human.getLastName()=="Nguyễn")lstHoNguyen.add(human);
        }
        if(lstHoNguyen.stream().count()==0){
            System.out.println("Khong co ai co ho la Nguyen");
        }
        else {
            Collections.sort(lstHoNguyen);
        }
        // In ra danh sach nhung nguoi co do tuoi tu 20-30
        long soNguoi = lstHuman.stream().filter(item-> item.getAge()>20).filter(item->item.getAge()<30).count();
        System.out.println("SO luong nguoi co do tuoi tu 20-30 la " + soNguoi);
        // Dem so luong thanh pho
       //lstHuman.stream().distinct().


    }
}
