package OOP.B13_Lambda.Lambda.LamDa_BTVN2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    // functional interface
    public static double inSo(Function<List<Student>, Double> fn, List<Student> lstStudent) {
        return fn.apply(lstStudent);
    }

    public static void inString(Predicate<Student> predicate, Student student) {
        if (predicate.test(student)) {
            System.out.println(student);
        }
    }

    private static App app = null;
    private List<Student> studentList;

    // Khoá không cho tạo đối tượng bên ngoài App
    private App() {
        studentList = new ArrayList<>();
    }

    // Tạo phương tĩnh để tạo đối tượng
    public static App getInstance() {
        if (app == null) app = new App();
        return app;
    }

    // Lấy ra danh sách sinh viên

    public List<Student> danhSachSinhVien() {
        return studentList;
    }

    // Thêm sinh viên vào danh sách sinh viên

    public boolean themSinhVien(Student student) {
        return studentList.add(student);
    }


}
