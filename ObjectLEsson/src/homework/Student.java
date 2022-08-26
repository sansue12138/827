package homework;

/**
 * @author liuchang
 * @Create 2022-08-20-16:36
 */
public class Student {
    private String name;
    private int age;
    private String school;
    private String major;

    public Student(String name ,int age){
        this.name=name;
        this.age =age;
    }
    public Student(String name,int age,String school){
        this.name=name;
        this.age =age;
        this.school =school;
    }
    public Student(String name,int age,String school,String major){
        this.name=name;
        this.age =age;
        this.school =school;
        this.major=major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }

    public String getMajor() {
        return major;
    }
}
