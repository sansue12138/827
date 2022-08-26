package test;

import java.rmi.Naming;

/**
 * @author liuchang
 * @Create 2022-08-18-17:01
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person= new Person();
        person.age=22;
        person.name="刘畅";
        person.eat();
        person.talk("中文");
        System.out.println(person.name);


        Person person1 =new Person();
        System.out.println(person1.name);
    }
}

class Person{
    //属性（类中的成员变量）=field=域、字段
    String name;
    int age ;
    boolean isMarried;

    //方法=成员方法=函数=function
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话，使用的是"+language+"语言");
    }
}
