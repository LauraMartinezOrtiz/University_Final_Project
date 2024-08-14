package src.com.globant.training.data;

public class Student extends Person {

    private long id;
    private int age;

    public Student(String name, int age, long id) {
        super(name);
        this.age = age;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}