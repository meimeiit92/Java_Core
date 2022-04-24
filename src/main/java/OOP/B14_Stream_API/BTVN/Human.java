package OOP.B14_Stream_API.BTVN;

public class Human implements Comparable<Human> {
    private int id, gender, age, salary;
    private String  firstName, lastName,city;

    @Override
    public int compareTo(Human human) {
        // sort human's name by ASC
        this.getFirstName().compareTo(human.getFirstName());
        return this.getLastName().compareTo(human.getLastName());
    }

    public Human() {
    }

    public Human(int id, int gender, int age, int salary, String firstName, String lastName, String city) {
        super();
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public int getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }
}
