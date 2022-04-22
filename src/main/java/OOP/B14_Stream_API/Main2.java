package OOP.B14_Stream_API;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        // Tao 1 class Student:
        // - id, fullname, age, mark, gender, country
        // Su dung faker tao danh sach 100 sinh vien.
        // Su dung stream API:
        // 1. Dem so luong sinh vien nam
        // 2. Dem so luong cac ban nu tren 20 tuoi va co diem so tren 50
        // In ra danh sach ban nam co ten bat dau bang A
        // va co tuoi tu 19 ro len
        // Lay ra danh sach sinh vien theo tung country
        // VietNam....
        List<OOP.B14_Stream_API.Student> studentList = new ArrayList<>();
        Faker faker = new Faker(new Locale("vi","VN"));
        for(int i=0;i<100;i++){
            OOP.B14_Stream_API.Student s = new Student();
            s.setId(faker.idNumber().valid());
            s.setName(faker.name().fullName());
            s.setAge(faker.number().numberBetween(18,24));
            s.setGender(faker.number().numberBetween(0,2));
            s.setCountry(faker.country().countryCode2());
            s.setMark(faker.number().numberBetween(0,100));
            studentList.add(s);
        }
        System.out.println(studentList);
        // Dem so luong sinh vien nam
        long  soSvNam = studentList.stream().filter(item ->item.getGender()==1).count();
        System.out.println("SO luong sinh vien nam la" + soSvNam);
        // so nu tren 20 tuoi , diem hon 50
        long soSvNu = studentList.stream().filter(item -> item.getGender()==0)
                .filter(item -> item.getMark()>50)
                .filter(item -> item.getAge()>20)
                .count();
        System.out.println(soSvNu);

        // nam tren 19 bat dau bang A
        long soNam = studentList.stream()
                .filter(s-> s.getGender()==1)
                .filter(s-> s.getAge() >=19)
                .filter(s -> s.getName().startsWith("A"))
                .count();
        System.out.println("So nam" + soNam);
        // country - List<Student>
        Map<String, List<Student>> map = studentList.stream().collect(Collectors.groupingBy(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getCountry();
            }
        }));
        // Xem có bao nhieu nuoc
        for(Map.Entry<String,List<Student>> entry: map.entrySet()){
            System.out.println("Country" + entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}
