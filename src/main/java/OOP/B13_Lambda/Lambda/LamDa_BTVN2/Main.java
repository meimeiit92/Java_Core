package OOP.B13_Lambda.Lambda.LamDa_BTVN2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static double inSo(Function<List<Student>, Double> fn, List<Student> lstStudent) {
        System.out.println(fn.apply(lstStudent));
        return fn.apply(lstStudent);
    }

    public static void inString(Predicate<Student> predicate, Student student) {
        if (predicate.test(student)) {
            System.out.println(student);
        }
    }
    public static void main(String[] args) {
        List<Student> lstStudent = new ArrayList<>();
        lstStudent.add(new Student("1","Mei1", "Nu",20,100 ));
        lstStudent.add(new Student("2","Mei2", "Nam",10,40 ));
        // In ra tuoi trung binh cua các sinh vien trong danh sach
        System.out.println("Tuoi trung binh cua sinh vien la");
        inSo ((fn) ->{
            double tuoiTB = 0;
            double tmp = fn.get(0).getAge();
            for (int i=1;i<fn.size();i++){
                tuoiTB = (tmp+fn.get(i).getAge())/2;

            }
            return  tuoiTB;

        },lstStudent);
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
        // In ra thong tin nhung nguoi co tuoi > 19
        System.out.println("Danh sach sinh vien cos tuoi > 19 la");
        for (Student stu : lstStudent) {
            inString ((predicate) -> {
                if(stu.getAge()>19) return true;
                return false;

            },stu);
        }
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
