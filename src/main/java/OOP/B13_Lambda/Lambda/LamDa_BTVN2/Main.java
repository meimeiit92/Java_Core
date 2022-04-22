package OOP.B13_Lambda.Lambda.LamDa_BTVN2;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static double inSo(Function<List<Student>, Double> fn, List<Student> lstStudent) {
        return fn.apply(lstStudent);
    }

    public static void inString(Predicate<Student> predicate, Student student) {
        if (predicate.test(student)) {
            System.out.println(student);
        }
    }

    // thay chua
    public static void usingPredicate(Predicate<Student> predicate, List<Student> lstStudent){
        for (Student s : lstStudent){
            if(predicate.test(s)){
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args) {
        // thay chua, tao danh sach sinh vien
        List<Student> studentList = new ArrayList<>();
        Faker faker = new Faker();
        for(int i=0;i<100;i++){
            Student s = new Student();
            s.setId(faker.idNumber().valid());
            s.setName(faker.name().fullName());
            s.setAge(faker.number().numberBetween(18,24));
            s.setGender(faker.name().nameWithMiddle());
            studentList.add(s);
        }
        System.out.println(studentList);
        List<Student> lstStudent = new ArrayList<>();
        lstStudent.add(new Student("1","Mei1", "Nu",20,100 ));
        lstStudent.add(new Student("2","Mei2", "Nam",10,40 ));
        // In ra tuoi trung binh cua các sinh vien trong danh sach
        System.out.println("Tuoi trung binh cua sinh vien la");
        double tuoiTB=  inSo ((fn) ->{
            double tb = 0;
            for(Student s: lstStudent){
                tb += s.getAge();
            }
            return  tb/ lstStudent.size();

        },lstStudent);
        System.out.println(tuoiTB);
        // In ra diem so cao nhat
        System.out.println("Diem so cao nhat la");
        inSo ((fn) ->{
            double tmp = fn.get(0).getMark();
            for (int i=1;i<fn.size();i++){
                if(tmp < fn.get(i).getMark()){
                    tmp = fn.get(i).getMark();
                }

            }
            return  tmp;

        },lstStudent);
        // In ra diem so thap nhat
        System.out.println("Diem so thap nhat la");
        inSo ((fn) ->{
            double tmp = fn.get(0).getMark();
            for (int i=1;i<fn.size();i++){
                if(tmp > fn.get(i).getMark()){
                    tmp = fn.get(i).getMark();
                }

            }
            return  tmp;

        },lstStudent);
        // timf diem pho bien nhat -> nhieu ban cung dat diem so do
        // 1->100 50 cos 4 ban, 60 cung co 4 ban
        // Danh sach diem -> danh sach diem so duy nhat khong trung lap -> set
        // tu danh sach do -> so lan lap lai cua tung dau diem
        // [10,20....]-> tim max so lan lap lai

        // In ra thong tin nhung nguoi co tuoi > 19
        System.out.println("Danh sach sinh vien cos tuoi > 19 la");
        for (Student stu : lstStudent) {
            inString ((predicate) -> {
                if(stu.getAge()>19) return true;
                return false;

            },stu);
        }
        // Thay chua
        usingPredicate((student -> {
            if(student.getAge()>19) return  true;
            return false;
        }), studentList);

        // In ra thông tin các nữ sinh viên.
        System.out.println("Danh sach sinh vien la nu ");
        for (Student stu : lstStudent) {
            inString ((predicate) -> {
                if(stu.getGender() == "Nu") return true;
                return false;

            },stu);
        }
        // In ra thông tin những bạn điểm dưới < 50.
        System.out.println("Danh sach sinh vien co diem <50");
        for (Student stu : lstStudent) {
            inString ((predicate) -> {
                if(stu.getMark() <50) return true;
                return false;

            },stu);
        }
    }


}
