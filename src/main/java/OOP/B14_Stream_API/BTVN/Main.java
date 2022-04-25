package OOP.B14_Stream_API.BTVN;

import OOP.B14_Stream_API.Student;
import com.github.javafaker.Faker;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        Map<String, List<Human>> map = lstHuman.stream().collect(Collectors.groupingBy(new Function<Human, String>() {
            @Override
            public String apply(Human human) {
                return human.getCity();
            }
        }));
        // In ra danh sach City
        for(Map.Entry<String,List<Human>> entry: map.entrySet()){
            System.out.println("Thanh pho  " + entry.getKey());
           // System.out.println("Thanh pho "+ entry.getValue());
        }
        // In ra so luong thanh pho
        System.out.println("So luong thanh pho la " + map.size());

        // Lay ra 1o nguoi dau tien trong danh sach
        lstHuman.stream().filter(item -> item.getId()>=0).limit(10).forEach(i-> System.out.println(i + ""));
        // Tinh do tuoi trung binh
        int sum =  lstHuman.stream().mapToInt(value -> value.getAge()).sum();
        System.out.println("do tuoi trung binh la " + sum/1000);
        // Tinh muc luong trung binh cua Nam o do tuoi tu 20-40
        long iafhia= lstHuman.stream().filter(item -> item.getGender()==1).filter(item -> item.getAge()>20)
                .filter(item -> item.getAge()<40).count();
        int sumSalary = lstHuman.stream().filter(item -> item.getGender()==1).filter(item -> item.getAge()>20)
                .filter(item -> item.getAge()<40).mapToInt(value -> value.getSalary()).sum();
        System.out.println("Muc luong turng binh cua nam o do tuoi tu 20-40 la "+ sumSalary/iafhia + "viet nam dong");
        // Sap xep danh sach theo do tuoi
        List<Human> sortHuman = lstHuman.stream().sorted((o1,o2) -> o1.getAge() - o2.getAge()).collect(Collectors.toList());
        sortHuman.forEach(t-> System.out.println(t + ""));

    }
}
