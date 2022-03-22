package OOP.TinhDongGoi;

public class Student {
     // Thuoc tinh
     int id;
     String name;
     boolean gender;
    public Student(){}
    public Student(int id, String name, boolean gender)
    {
        this.id=id;
        this.name=name;
        this.gender=gender;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean isGender() {
        return gender;
    }
}
