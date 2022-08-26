package homework;

/**
 * @author liuchang
 * @Create 2022-08-20-16:37
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student1 =new Student("张三",22);
        Student student2 = new Student("李四",24,"阜阳市第三中学");
        Student student3 =new Student("王五",26,"阜阳市城郊中学","中文");
        System.out.println("姓名："+student1.getName()+" 年龄："+student1.getAge());
        System.out.println("姓名："+student2.getName()+" 年龄："+student2.getAge()+" 学校："+student2.getSchool());
        System.out.println("姓名："+student3.getName()+" 年龄："+student3.getAge()+" 学校："+student3.getSchool()+" 专业:"+student3.getMajor());
    }
}
