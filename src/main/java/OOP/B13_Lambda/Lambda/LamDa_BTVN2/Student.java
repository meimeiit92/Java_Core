package OOP.B13_Lambda.Lambda.LamDa_BTVN2;

public class Student {
    private String id, name, gender;
    private double age, mark;

    public Student() {
    }

    public Student(String id, String name, String gender, int age, int mark) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}
