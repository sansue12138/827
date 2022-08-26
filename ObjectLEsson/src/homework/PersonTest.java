package homework;

/**
 * @author liuchang
 * @Create 2022-08-18-22:04
 */
public class PersonTest {
    public static void main(String[] args) {
    Person person = new Person();
    person.name ="Tom";
    person.age=22;
    person.sex="男";

    person.study();
    person.showAge();
    int newAge = person.addAge(person.age);
        System.out.println(newAge);
    }
}

class Person {
    String name;
    int age;
    String sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println("年龄为" + age);
    }

    public int addAge(int age) {
        age = age + 2;
        return age;
    }
}
